package com.ViewModel

import androidx.lifecycle.LiveData
import com.Domain.BannerModel
import com.Repository.MainRepository

class MainViewModel {
    private val repository= MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }
}