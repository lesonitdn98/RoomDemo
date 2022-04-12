package tech.sonle.roomdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import tech.sonle.roomdemo.data.repository.local.DatabaseManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        // Khoi tao

        val databaseManager = Room.databaseBuilder(
            this,
            DatabaseManager::class.java,
            DatabaseManager.DATABASE_NAME
        ).build()
        viewModel.addAll(databaseManager)

        // Show result
        viewModel.getAll(databaseManager)
    }
}