package com.example.roomnotes.presentation.ui.utils

import android.widget.Toast
import androidx.fragment.app.Fragment

fun Fragment.showToast(msg: String) {
    Toast.makeText(requireContext(), msg, Toast.LENGTH_SHORT).show()
}