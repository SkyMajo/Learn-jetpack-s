package com.mooc.ppjoke.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.button.MaterialButton;
import com.mooc.ppjoke.model.Comment;
import com.mooc.ppjoke.view.PPImageView;

public abstract class LayoutFeedCommentListItemBinding extends ViewDataBinding {
  @NonNull
  public final PPImageView authorAvatar;

  @NonNull
  public final TextView authorName;

  @NonNull
  public final PPImageView commentCover;

  @NonNull
  public final ImageView commentDelete;

  @NonNull
  public final FrameLayout commentExt;

  @NonNull
  public final TextView commentLike;

  @NonNull
  public final TextView commentText;

  @NonNull
  public final TextView createTime;

  @NonNull
  public final MaterialButton labelAuthor;

  @NonNull
  public final ImageView videoIcon;

  @Bindable
  protected Comment mComment;

  @Bindable
  protected LifecycleOwner mOwner;

  protected LayoutFeedCommentListItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, PPImageView authorAvatar, TextView authorName, PPImageView commentCover,
      ImageView commentDelete, FrameLayout commentExt, TextView commentLike, TextView commentText,
      TextView createTime, MaterialButton labelAuthor, ImageView videoIcon) {
    super(_bindingComponent, _root, _localFieldCount);
    this.authorAvatar = authorAvatar;
    this.authorName = authorName;
    this.commentCover = commentCover;
    this.commentDelete = commentDelete;
    this.commentExt = commentExt;
    this.commentLike = commentLike;
    this.commentText = commentText;
    this.createTime = createTime;
    this.labelAuthor = labelAuthor;
    this.videoIcon = videoIcon;
  }

  public abstract void setComment(@Nullable Comment comment);

  @Nullable
  public Comment getComment() {
    return mComment;
  }

  public abstract void setOwner(@Nullable LifecycleOwner owner);

  @Nullable
  public LifecycleOwner getOwner() {
    return mOwner;
  }

  @NonNull
  public static LayoutFeedCommentListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedCommentListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedCommentListItemBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_comment_list_item, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutFeedCommentListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutFeedCommentListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutFeedCommentListItemBinding>inflate(inflater, com.mooc.ppjoke.R.layout.layout_feed_comment_list_item, null, false, component);
  }

  public static LayoutFeedCommentListItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutFeedCommentListItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutFeedCommentListItemBinding)bind(component, view, com.mooc.ppjoke.R.layout.layout_feed_comment_list_item);
  }
}
