package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mooc.libcommon.view.EmptyView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

public abstract class LayoutRefreshViewBinding extends ViewDataBinding {
  @NonNull
  public final EmptyView emptyView;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SmartRefreshLayout refreshLayout;

  protected LayoutRefreshViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, EmptyView emptyView, RecyclerView recyclerView,
      SmartRefreshLayout refreshLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emptyView = emptyView;
    this.recyclerView = recyclerView;
    this.refreshLayout = refreshLayout;
  }

  @NonNull
  public static LayoutRefreshViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutRefreshViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutRefreshViewBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_refresh_view, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutRefreshViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutRefreshViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutRefreshViewBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_refresh_view, null, false, component);
  }

  public static LayoutRefreshViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutRefreshViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutRefreshViewBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_refresh_view);
  }
}
