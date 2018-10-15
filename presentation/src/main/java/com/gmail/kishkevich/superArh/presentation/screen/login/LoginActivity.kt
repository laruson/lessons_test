package com.gmail.kishkevich.superArh.presentation.screen.login

import android.arch.lifecycle.ViewModelProviders
import com.gmail.kishkevich.data.databinding.ActivityLogginBinding

import com.gmail.kishkevich.superArh.presentation.base.BaseMvvmActivity

class LoginActivity : BaseMvvmActivity<LoginViewModel, ActivityLogginBinding>() {
    override fun provideViewModel(): LoginViewModel {
        return ViewModelProviders.of(this)
                .get(LoginViewModel::class.java)
    }

    override fun provideLayoutId(): Int = R.layout

}
