package com.moral.commotrade.lobotusassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView my_recycler_view_bid,my_recycler_view_rid;
    TextView txtbid,txtrid,txtbidrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        my_recycler_view_bid = findViewById(R.id.my_recycler_view_bid);
        my_recycler_view_rid = findViewById(R.id.my_recycler_view_rid);
        my_recycler_view_rid.setVisibility(View.GONE);
        txtbid = findViewById(R.id.txtbid);
        txtrid = findViewById(R.id.txtrid);
        txtbidrid = findViewById(R.id.txtbidrid);

        txtbid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_recycler_view_bid.setVisibility(View.VISIBLE);
                my_recycler_view_rid.setVisibility(View.GONE);
                txtbidrid.setText("BID");
                txtbid.setTextColor(Color.parseColor("#4769AC"));
                txtrid.setTextColor(Color.parseColor("#000000"));

            }
        });

        txtrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                my_recycler_view_bid.setVisibility(View.GONE);
                my_recycler_view_rid.setVisibility(View.VISIBLE);
                txtbidrid.setText("RID");
                txtrid.setTextColor(Color.parseColor("#4769AC"));
                txtbid.setTextColor(Color.parseColor("#000000"));
            }
        });

        getData();
        getRidData();
    }


    private void getData() {
        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
        retrofit2.Call<Result> call = apiInterface.doCreateUserWithField(new UserRequest("2", ""));
        call.enqueue(new Callback<Result>() {
            @Override
            public void onResponse(retrofit2.Call<Result> call, Response<Result> response) {
                if (response.code() == 200) {

// recycle view
                    List<BID> userDetails = response.body().bID;

                    CustomAdapter adapter = new CustomAdapter(userDetails, getBaseContext());
                    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                    my_recycler_view_bid.setLayoutManager(mLayoutManager);
                    my_recycler_view_bid.setItemAnimator(new DefaultItemAnimator());
                    my_recycler_view_bid.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(retrofit2.Call<Result> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();

            }

        });
    }


    private void getRidData() {
        APIInterfaceRip apiInterfaceRip = APIClient.getClient().create(APIInterfaceRip.class);
        retrofit2.Call<RidResult> call = apiInterfaceRip.doCreateUserWithField(new UserRequest("2", ""));
        call.enqueue(new Callback<RidResult>() {
            @Override
            public void onResponse(retrofit2.Call<RidResult> call, Response<RidResult> response) {
                if (response.code() == 200) {

// recycle view
                    List<RID> userDetails = response.body().data;
                  /*  String[] userDetail = new String[userDetails.size()];
                    for (int i = 0; i < userDetails.size(); i++) {
                        userDetail[i] = userDetails.get(i).rID;
                        userDetail[i] = userDetails.get(i).controllerItemCode;
                        userDetail[i] = userDetails.get(i).pumpHeadSrNo;
                        userDetail[i] = userDetails.get(i).motorSerialNumber;
                        userDetail[i] = userDetails.get(i).controllerSerialNumber;
                    }*/

                    CustomAdapterRid adapter = new CustomAdapterRid(userDetails, getBaseContext());
                    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                    my_recycler_view_rid.setLayoutManager(mLayoutManager);
                    my_recycler_view_rid.setItemAnimator(new DefaultItemAnimator());
                    my_recycler_view_rid.setAdapter(adapter);

                }
            }

            @Override
            public void onFailure(retrofit2.Call<RidResult> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed RID", Toast.LENGTH_SHORT).show();

            }

        });
    }
}