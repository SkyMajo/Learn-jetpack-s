package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

public abstract class FragmentSofaBinding extends ViewDataBinding {
  @NonNull
  public final TabLayout tabLayout;

  @NonNull
  public final ViewPager2 viewPager;

  protected FragmentSofaBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TabLayout tabLayout, ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tabLayout = tabLayout;
    this.viewPager = viewPager;
  }

  @NonNull
  public static FragmentSofaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSofaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSofaBinding>inflate(inflater, com.mooc.ppjoke.R.layout.fragment_sofa, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSofaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSofaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSofaBinding>inflate(inflater, com.mooc.ppjoke.R.layout.fragment_sofa, null, false, component);
  }

  public static FragmentSofaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSofaBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSofaBinding)bind(component, view, com.mooc.ppjoke.R.layout.fragment_sofa);
  }
}
