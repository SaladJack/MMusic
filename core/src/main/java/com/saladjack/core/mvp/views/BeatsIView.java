package com.saladjack.core.mvp.views;

import com.saladjack.core.bean.AccountBean;
import com.saladjack.core.bean.Song;

import java.util.List;

/**
 * @author: saladjack
 * @date: 2016/7/7
 * @desciption: 首页v接口
 */
public interface BeatsIView {
    void setUserDetail(AccountBean accountBean);

    void getUserFail(String msg);

    void getRandomSongs(List<Song> songs);

    void getSongsFail(String msg);
}
