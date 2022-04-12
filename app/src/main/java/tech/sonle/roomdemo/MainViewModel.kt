package tech.sonle.roomdemo

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import tech.sonle.roomdemo.data.model.Cat
import tech.sonle.roomdemo.data.model.Dog
import tech.sonle.roomdemo.data.repository.local.DatabaseManager

/**
 * Create by SonLe on 12/04/2022
 */
class MainViewModel : ViewModel() {
    fun addAll(databaseManager: DatabaseManager) {
        viewModelScope.launch(IO) {
            databaseManager.dogDao().add(Dog(name = "dog", type = "cho", age = "10"))
            databaseManager.dogDao().add(Dog(name = "dog1", type = "cho", age = "11"))
            databaseManager.dogDao().add(Dog(name = "dog2", type = "cho", age = "12"))

            databaseManager.catDao().add(Cat(name = "cat", type = "meo", age = "10"))
            databaseManager.catDao().add(Cat(name = "cat1", type = "meo", age = "11"))
            databaseManager.catDao().add(Cat(name = "cat2", type = "meo", age = "12"))
        }
    }

    fun getAll(databaseManager: DatabaseManager) {
        viewModelScope.launch(IO) {
            val dogs = databaseManager.dogDao().getAll()
            val cats = databaseManager.catDao().getAll()

            dogs.forEach { dog ->
                Log.d("test", "${dog.name}")
            }

            cats.forEach { cat ->
                Log.d("test", "${cat.name}")
            }
        }
    }
}