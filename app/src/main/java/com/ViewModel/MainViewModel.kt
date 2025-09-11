package com.ViewModel

import android.adservices.adid.AdId
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.Domain.BannerModel
import com.Domain.CategoryModel
import com.Domain.ItemsModel
import com.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository= MainRepository()

    fun loadBanner(): LiveData<MutableList<BannerModel>>{
        return repository.loadBanner()
    }

    fun loadCategory(): LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }

    fun loadPopular(): LiveData<MutableList<ItemsModel>>{
        return repository.loadPopular()
    }

    fun loadItems(categoryID: String): LiveData<MutableList<ItemsModel>> {
        return repository.loadItemCategory(categoryID)
    }
}