package com.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.Domain.BannerModel
import com.Domain.CategoryModel
import com.Repository.MainRepository

class MainViewModel {
    private val repository= MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }

    fun loadCategory(): LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }
}