package com.abel.app.b2b.flexiicar.commonfragment;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import com.abel.app.b2b.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowAdapter implements GoogleMap.InfoWindowAdapter
{
    private Activity context;

    public CustomInfoWindowAdapter(Activity context)
    {
        this.context = context;
    }
    @Override
    public View getInfoWindow(Marker marker)
    {
        View view = context.getLayoutInflater().inflate(R.layout.custom_infowindow, null);

        TextView tvTitle = (TextView) view.findViewById(R.id.tv_title);
        TextView tvSubTitle = (TextView) view.findViewById(R.id.tv_subtitle);
        tvTitle.setText(marker.getTitle());
        tvSubTitle.setText(marker.getSnippet());
        return view;
    }

    @Override
    public View getInfoContents(Marker marker)
    {

        return null;
    }


}
