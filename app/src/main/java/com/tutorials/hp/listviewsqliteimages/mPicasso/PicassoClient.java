package com.tutorials.hp.listviewsqliteimages.mPicasso;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.tutorials.hp.listviewsqliteimages.R;

/**
 * Created by Oclemmy on 4/29/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 */
public class PicassoClient {

    public static void loadImage(Context c,String url,ImageView img)
    {
        if(url != null && url.length()>0)
        {
            Picasso.with(c).load(url).placeholder(R.drawable.placeholder).into(img);
        }else
        {
            Picasso.with(c).load(R.drawable.placeholder).into(img);
        }
    }

}
