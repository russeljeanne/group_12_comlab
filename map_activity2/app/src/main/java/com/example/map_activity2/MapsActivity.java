package com.example.map_activity2;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);



        LatLng BIS = new LatLng(16.081627042615185, 120.58161602939174);
        mMap.addMarker(new MarkerOptions().position(BIS).title("Bugayong Integrated School").snippet("Bugayong, Binalonan, Pangasinan"));


        LatLng LMMSAT = new LatLng(16.00499438826022, 120.66618382345759);
        mMap.addMarker(new MarkerOptions().position(LMMSAT).title("Luciano Millan National High School").snippet("Poblacion West, Asingan, Pangasinan"));


        LatLng SINHS = new LatLng(16.099428808336288, 120.74231968304463);
        mMap.addMarker(new MarkerOptions().position(SINHS).title("San Isidro National High School").snippet("San Nicolas, Pangasinan"));

        LatLng center = new LatLng(16.06353737051168, 120.66883790383666);
        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ucu_address,11),1000,null);

        CameraPosition cameraPosition= new CameraPosition.Builder()
        .target(center)
        .zoom(12)
        .build();

        mMap.animateCamera(CameraUpdateFactory. newCameraPosition(cameraPosition));
    }
}