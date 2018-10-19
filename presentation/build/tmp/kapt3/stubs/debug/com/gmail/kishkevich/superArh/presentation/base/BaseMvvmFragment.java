package com.gmail.kishkevich.superArh.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J&\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH&J\r\u0010\u001d\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000fR\u001c\u0010\u0007\u001a\u00028\u0001X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/gmail/kishkevich/superArh/presentation/base/BaseMvvmFragment;", "VM", "Lcom/gmail/kishkevich/superArh/presentation/base/BaseViewModel;", "B", "Landroid/databinding/ViewDataBinding;", "Lcom/gmail/kishkevich/superArh/presentation/base/BaseFragment;", "()V", "binding", "getBinding", "()Landroid/databinding/ViewDataBinding;", "setBinding", "(Landroid/databinding/ViewDataBinding;)V", "Landroid/databinding/ViewDataBinding;", "viewModel", "getViewModel", "()Lcom/gmail/kishkevich/superArh/presentation/base/BaseViewModel;", "setViewModel", "(Lcom/gmail/kishkevich/superArh/presentation/base/BaseViewModel;)V", "Lcom/gmail/kishkevich/superArh/presentation/base/BaseViewModel;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "provideLayoutId", "", "provideViewModel", "presentation_debug"})
public abstract class BaseMvvmFragment<VM extends com.gmail.kishkevich.superArh.presentation.base.BaseViewModel, B extends android.databinding.ViewDataBinding> extends com.gmail.kishkevich.superArh.presentation.base.BaseFragment {
    @org.jetbrains.annotations.NotNull()
    protected VM viewModel;
    @org.jetbrains.annotations.NotNull()
    protected B binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final B getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM provideViewModel();
    
    public abstract int provideLayoutId();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public BaseMvvmFragment() {
        super();
    }
}