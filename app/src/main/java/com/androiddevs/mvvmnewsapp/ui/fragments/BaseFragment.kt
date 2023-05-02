package com.androiddevs.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.androiddevs.mvvmnewsapp.NewsActivity
import kotlinx.android.synthetic.main.fragment_breaking_news.*

open class BaseFragment : Fragment() {

    lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

    fun hideProgressBar() {
        paginationProgressBar.visibility = View.GONE
    }

    fun showProgressBar() {
        paginationProgressBar.visibility = View.VISIBLE
    }
}