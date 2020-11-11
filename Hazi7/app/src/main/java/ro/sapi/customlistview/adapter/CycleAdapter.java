package ro.sapi.customlistview.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import ro.sapi.customlistview.R;
import ro.sapi.customlistview.activity.DetailActivity;
import ro.sapi.customlistview.model.Stuff;

public class CycleAdapter extends RecyclerView.Adapter<CycleAdapter.VH> {
    private Activity mContext;
    private List<Stuff> mStuff;

    public  CycleAdapter(Activity context,List<Stuff> stuffs)
    {
        mContext = context;
        if (stuffs == null) {
            throw new IllegalArgumentException("contacts must not be null");
        }
        mStuff = stuffs;
    }

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.listview_row, parent, false);
        return new VH(itemView, mContext);
    }

    @Override
    public void onBindViewHolder(VH holder, int position) {
        Stuff contact = mStuff.get(position);
        holder.rootView.setTag(contact);
        holder.tvName.setText(contact.getName());
        holder.ivProfile.setImageResource(contact.getImg());

    }
    @Override
    public int getItemCount() {
        return mStuff.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        final View rootView;
        final ImageView ivProfile;
        final TextView tvName;
        final TextView tvInfo;

        public VH(View itemView, final Context context) {
            super(itemView);
            rootView = itemView;
            ivProfile = (ImageView)itemView.findViewById(R.id.imageView1ID);
            tvName = (TextView)itemView.findViewById(R.id.nameTextViewID);
            tvInfo = (TextView)itemView.findViewById(R.id.infoTextViewID);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Stuff contact = (Stuff) v.getTag();
                    if (contact != null) {
                        Intent i=new Intent(mContext, DetailActivity.class);
                        i.putExtra("EXTRA_CONTACT",contact);
                        mContext.startActivity(i);
                    }
                }
            });
        }
    }




}
