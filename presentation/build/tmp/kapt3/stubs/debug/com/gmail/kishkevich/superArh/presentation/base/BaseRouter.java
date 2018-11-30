package com.gmail.kishkevich.superArh.presentation.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\t\u001a\u00020\nJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016R\u0013\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/gmail/kishkevich/superArh/presentation/base/BaseRouter;", "A", "Landroid/app/Activity;", "", "activity", "(Landroid/app/Activity;)V", "getActivity", "()Landroid/app/Activity;", "Landroid/app/Activity;", "goBack", "", "replaceFragment", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "fragment", "Lcom/gmail/kishkevich/superArh/presentation/base/BaseFragment;", "containerResId", "", "addToBackStack", "", "showError", "e", "", "presentation_debug"})
public abstract class BaseRouter<A extends android.app.Activity> {
    @org.jetbrains.annotations.NotNull()
    private final A activity = null;
    
    public final void goBack() {
    }
    
    public final void showError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable e) {
    }
    
    public final void replaceFragment(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    com.gmail.kishkevich.superArh.presentation.base.BaseFragment fragment, int containerResId, boolean addToBackStack) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final A getActivity() {
        return null;
    }
    
    public BaseRouter(@org.jetbrains.annotations.NotNull()
    A activity) {
        super();
    }
}