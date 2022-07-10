package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class newsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public newsViewModel() {
        this.news = new MutableLiveData<>();
        List<News> news = new ArrayList<>();

        //remover mock de notícias
        news.add(new News("Ferroviária Desfalque Importante", "kdflnsçlfgtjsdopikfgjsdofjsadofjigsdo fjsdoijtfsdoijft sadoipt soaifgjt sopadjifg sdopijfgsadoifgjsdojg spoigjsd"));
        news.add(new News("Flamengo bate Corinthians", "s gjfsdlgsd oifgtjsdpogsoighsd u ghsdpoighsdiufgh sdpo ghsdfpoighfsdpoiug hsdfipougsdfpoiuhg sdifpg hfsdoiupg oifpsduhg"));
        news.add(new News("Palmeiras perde de novo", "o sdjgçosdiuh glisduh gsdah gsdoiuh gsdiuhg siudh goisdufhg oiufsdh goiufsdh goiufsdh gioufsdh giuofsdh goiud giuiuh "));
        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}