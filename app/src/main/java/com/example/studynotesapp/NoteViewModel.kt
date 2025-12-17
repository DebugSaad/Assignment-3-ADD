package com.example.studynotesapp

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.util.UUID

class NoteViewModel(private val stateHandle: SavedStateHandle) : ViewModel() {

    val notesLiveData = stateHandle.getLiveData<List<Note>>("NOTES_KEY", emptyList())

    fun addNote(title: String, content: String) {
        val currentList = notesLiveData.value?.toMutableList() ?: mutableListOf()
        val newNote = Note(
            id = UUID.randomUUID().toString(),
            title = title,
            content = content
        )
        currentList.add(0, newNote) // Add to top

        // Data ko stateHandle mein update karo (Yeh automatically OS events par save ho jayega)
        stateHandle["NOTES_KEY"] = currentList
    }
}