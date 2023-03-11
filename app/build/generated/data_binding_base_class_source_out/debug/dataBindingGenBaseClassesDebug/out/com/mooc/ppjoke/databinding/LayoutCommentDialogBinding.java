package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.mooc.libcommon.view.PPEditTextView;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutCommentDialogBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView commentCover;

  @NonNull
  public final AppCompatImageView commentDelete;

  @NonNull
  public final FrameLayout commentExtLayout;

  @NonNull
  public final AppCompatImageView commentIconVideo;

  @NonNull
  public final MaterialButton commentSend;

  @NonNull
  public final AppCompatImageView commentVideo;

  @NonNull
  public final PPEditTextView inputView;

  protected LayoutCommentDialogBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PPImageView commentCover, AppCompatImageView commentDelete,
      FrameLayout commentExtLayout, AppCompatImageView commentIconVideo, MaterialButton commentSend,
      AppCompatImageView commentVideo, PPEditTextView inputView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.commentCover = commentCover;
    this.commentDelete = commentDelete;
    this.commentExtLayout = commentExtLayout;
    this.commentIconVideo = commentIconVideo;
    this.commentSend = commentSend;
    this.commentVideo = commentVideo;
    this.inputView = inputView;
  }

  @NonNull
  public static LayoutCommentDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutCommentDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutCommentDialogBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_comment_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutCommentDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutCommentDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutCommentDialogBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_comment_dialog, null, false, component);
  }

  public static LayoutCommentDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutCommentDialogBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutCommentDialogBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_comment_dialog);
  }
}
