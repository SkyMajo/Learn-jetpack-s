package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.mooc.ppjoke.view.PPImageView;

public abstract class ActivityLayoutPublishBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView actionAddFile;

  @NonNull
  public final MaterialButton actionAddTag;

  @NonNull
  public final ImageView actionClose;

  @NonNull
  public final AppCompatImageView actionDeleteFile;

  @NonNull
  public final MaterialButton actionPublish;

  @NonNull
  public final PPImageView cover;

  @NonNull
  public final FrameLayout fileContainer;

  @NonNull
  public final View inputLine;

  @NonNull
  public final EditText inputView;

  @NonNull
  public final TextView title;

  @NonNull
  public final RelativeLayout topBar;

  @NonNull
  public final ImageView videoIcon;

  protected ActivityLayoutPublishBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppCompatImageView actionAddFile, MaterialButton actionAddTag,
      ImageView actionClose, AppCompatImageView actionDeleteFile, MaterialButton actionPublish,
      PPImageView cover, FrameLayout fileContainer, View inputLine, EditText inputView,
      TextView title, RelativeLayout topBar, ImageView videoIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.actionAddFile = actionAddFile;
    this.actionAddTag = actionAddTag;
    this.actionClose = actionClose;
    this.actionDeleteFile = actionDeleteFile;
    this.actionPublish = actionPublish;
    this.cover = cover;
    this.fileContainer = fileContainer;
    this.inputLine = inputLine;
    this.inputView = inputView;
    this.title = title;
    this.topBar = topBar;
    this.videoIcon = videoIcon;
  }

  @NonNull
  public static ActivityLayoutPublishBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutPublishBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutPublishBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_publish, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLayoutPublishBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityLayoutPublishBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityLayoutPublishBinding>inflate(inflater, com.mooc.ppjoke.R.layout.activity_layout_publish, null, false, component);
  }

  public static ActivityLayoutPublishBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityLayoutPublishBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityLayoutPublishBinding)bind(component, view, com.mooc.ppjoke.R.layout.activity_layout_publish);
  }
}
