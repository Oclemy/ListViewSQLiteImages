package com.tutorials.hp.listviewsqliteimages.mListView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tutorials.hp.listviewsqliteimages.R;

/**
 * Created by Oclemmy on 4/29/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class MyHolder {

    TextView nameTxt;
    ImageView img;

    public MyHolder(View v) {

        this.nameTxt= (TextView) v.findViewById(R.id.nameTxt);
        this.img= (ImageView) v.findViewById(R.id.movieImage);

    }
}
