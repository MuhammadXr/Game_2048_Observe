package uz.gita.game2048observeXR.app

import android.app.Application
import uz.gita.game2048observeXR.repository.Repository

class App: Application() {


    public var instance=this
    override fun onCreate() {
        super.onCreate()

        Repository.instens(this)
    }
}