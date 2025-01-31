package com.example.quicknotespoe.data

import androidx.annotation.Keep
import com.google.firebase.Timestamp
import com.google.firebase.firestore.DocumentId

@Keep // Ensures the class is not obfuscated by Proguard
data class Note(
    @DocumentId // Maps the Firestore document ID to this field
    val id: String = "",
    val title: String = "",
    val content: String = "",
    val timestamp: Timestamp = Timestamp.now()
)