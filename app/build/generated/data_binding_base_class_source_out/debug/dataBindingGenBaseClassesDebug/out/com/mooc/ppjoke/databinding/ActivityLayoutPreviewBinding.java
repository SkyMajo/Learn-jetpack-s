package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.material.button.MaterialButton;

public abstract class ActivityLayoutPreviewBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView actionClose;

  @NonNull
  public final MaterialButton actionOk;

  @NonNull
  public final PhotoView photoView;

  @NonNull
  public final PlayerView playerView;

  protected ActivityLayoutPreviewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView actionClose, MaterialButton actionOk,
      PhotoView photoView, PlayerView playerView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionClose = actionClose;
    this.actionOk = actionOk;
    this.photoView = photoView;
    this.playerView = playerView;
  }

  @NonNull
  public static ActivityLayoutPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutPreviewBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_preview, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLayoutPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutPreviewBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_preview, null, false, component);
  }

  public static ActivityLayoutPreviewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLayoutPreviewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLayoutPreviewBinding)bind(component, view, com.mooc.ppjoke.R.layout.activity_layout_preview);
  }
}
