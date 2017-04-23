package com.courseproject.rober_000.guide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GuideListFragment extends Fragment {

    private RecyclerView recView;
    private LinearLayoutManager verticalLinerLayoutManager;
    private CaptionedImagesAdapter adapter;

    public GuideListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guide_list, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            /////////////RECYCLE VIEW////////////////
            verticalLinerLayoutManager = new LinearLayoutManager(getContext());
            recView = (RecyclerView) view.findViewById(R.id.recycler);
            recView.setLayoutManager(verticalLinerLayoutManager);

            String guidesNames[] = new String[Guide.guides.length];
            for (int i = 0; i < guidesNames.length; i++) {
                guidesNames[i] = Guide.guides[i].getTitle();
            }

            String guidesDescription[] = new String[Guide.guides.length];
            for (int i = 0; i < guidesNames.length; i++) {
                guidesDescription[i] = Guide.guides[i].getDescription();
            }

            String imgLinks[] = new String[Guide.guides.length];
            for (int i = 0; i < guidesNames.length; i++) {
                imgLinks[i] = Guide.guides[i].getImgLink();
            }

            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(guidesNames, guidesDescription, imgLinks);
            recView.setAdapter(adapter);

            adapter.setListener(new CaptionedImagesAdapter.Listener(){
                public void onClick(int position) {
                    Intent intent = new Intent(getActivity(), GuideDetailActivity.class);
                    getActivity().startActivity(intent);
                }
            });
            /////////////RECYCLE VIEW////////////////
        }
    }
}
