package me.dio.soccernews.ui.favorites;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class favoritesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public favoritesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is favorites fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}