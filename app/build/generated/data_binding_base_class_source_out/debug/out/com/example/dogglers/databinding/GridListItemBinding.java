// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView age;

  @NonNull
  public final TextView hobbies;

  @NonNull
  public final ImageView imageview;

  @NonNull
  public final TextView name;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull TextView age,
      @NonNull TextView hobbies, @NonNull ImageView imageview, @NonNull TextView name) {
    this.rootView = rootView;
    this.age = age;
    this.hobbies = hobbies;
    this.imageview = imageview;
    this.name = name;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.age;
      TextView age = rootView.findViewById(id);
      if (age == null) {
        break missingId;
      }

      id = R.id.hobbies;
      TextView hobbies = rootView.findViewById(id);
      if (hobbies == null) {
        break missingId;
      }

      id = R.id.imageview;
      ImageView imageview = rootView.findViewById(id);
      if (imageview == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = rootView.findViewById(id);
      if (name == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, age, hobbies, imageview, name);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
