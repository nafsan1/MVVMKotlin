package com.example.kotlinmvvm.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/kotlinmvvm/viewModel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "listener", "Lcom/example/kotlinmvvm/interfacekotlin/LoginResultCallBacks;", "(Lcom/example/kotlinmvvm/interfacekotlin/LoginResultCallBacks;)V", "emailTextWatcher", "Landroid/text/TextWatcher;", "getEmailTextWatcher", "()Landroid/text/TextWatcher;", "passwordTextWatcher", "getPasswordTextWatcher", "user", "Lcom/example/kotlinmvvm/model/User;", "onLoginClicked", "", "v", "Landroid/view/View;", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.kotlinmvvm.model.User user = null;
    private final com.example.kotlinmvvm.interfacekotlin.LoginResultCallBacks listener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.TextWatcher getEmailTextWatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.TextWatcher getPasswordTextWatcher() {
        return null;
    }
    
    public final void onLoginClicked(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.example.kotlinmvvm.interfacekotlin.LoginResultCallBacks listener) {
        super();
    }
}