package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.mooc.ppjoke.view.RecordView;

public abstract class ActivityLayoutCaptureBinding extends ViewDataBinding {
  @NonNull
  public final TextView captureTips;

  @NonNull
  public final RecordView recordView;

  @NonNull
  public final TextureView textureView;

  protected ActivityLayoutCaptureBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView captureTips, RecordView recordView, TextureView textureView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.captureTips = captureTips;
    this.recordView = recordView;
    this.textureView = textureView;
  }

  @NonNull
  public static ActivityLayoutCaptureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutCaptureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutCaptureBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_capture, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLayoutCaptureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutCaptureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutCaptureBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_capture, null, false, component);
  }

  public static ActivityLayoutCaptureBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLayoutCaptureBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLayoutCaptureBinding)bind(component, view, com.mooc.ppjoke.R.layout.activity_layout_capture);
  }
}
