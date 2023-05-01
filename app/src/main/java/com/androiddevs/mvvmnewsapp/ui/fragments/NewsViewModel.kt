package com.androiddevs.mvvmnewsapp.ui.fragments

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.model.NewsResponse
import com.androiddevs.mvvmnewsapp.repository.NewsRepository

class NewsViewModel(val repository: NewsRepository) : ViewModel() {
}