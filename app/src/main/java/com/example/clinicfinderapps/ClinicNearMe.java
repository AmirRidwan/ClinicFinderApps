package com.example.clinicfinderapps;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.clinicfinderapps.databinding.ActivityClinicNearMeBinding;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

public class ClinicNearMe extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityClinicNearMeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityClinicNearMeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in Shah Alam and move the camera
        LatLng nisa = new LatLng(3.0767479234784147, 101.4967024618549);
        mMap.addMarker(new MarkerOptions().position(nisa).title("Klinik Nisa")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nisa));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(nisa, 10));

        LatLng selcare = new LatLng(3.076897450015213, 101.49451804360501);
        mMap.addMarker(new MarkerOptions().position(selcare).title("Selcare Clinic")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(selcare));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(selcare, 10));

        LatLng uitm = new LatLng(3.068377064028517, 101.49358509590576);
        mMap.addMarker(new MarkerOptions().position(uitm).title("Pusat Kesihatan UITM Shah Alam")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(uitm));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(uitm, 10));

        LatLng najat = new LatLng(3.065347628444869, 101.48894823985954);
        mMap.addMarker(new MarkerOptions().position(najat).title("Klinik Najat Seksyen 7")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(najat));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(najat, 10));

        LatLng ajwa = new LatLng(3.074887540981396, 101.48631363858648);
        mMap.addMarker(new MarkerOptions().position(ajwa).title("Klinik Ajwa")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ajwa));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ajwa, 10));

        LatLng noura = new LatLng(3.0766659621431396, 101.48930698378092);
        mMap.addMarker(new MarkerOptions().position(noura).title("Klinik Noura")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(noura));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(noura, 10));

        LatLng munawarah = new LatLng(3.0756481913823257, 101.50999754393753);
        mMap.addMarker(new MarkerOptions().position(munawarah).title("Klinik Munawarah")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(munawarah));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(munawarah, 10));

        LatLng nik = new LatLng(3.071437823975393, 101.51748627090588);
        mMap.addMarker(new MarkerOptions().position(nik).title("Klinik Nik Isahak")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nik));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(nik, 10));

        LatLng kelang = new LatLng(3.0606454534934158, 101.52575992595048);
        mMap.addMarker(new MarkerOptions().position(kelang).title("Klinik Kelang")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kelang));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kelang, 10));

        LatLng alam = new LatLng(3.0755023409721405, 101.48620807409868);
        mMap.addMarker(new MarkerOptions().position(alam).title("Klinik Alam Medic")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(alam));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(alam, 10));

        LatLng qualitas = new LatLng(3.0755023409721405, 101.48620807409868);
        mMap.addMarker(new MarkerOptions().position(qualitas).title("Qualitas Health")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(qualitas));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(qualitas, 10));

        LatLng hana = new LatLng(3.071675063955555, 101.52438160147335);
        mMap.addMarker(new MarkerOptions().position(hana).title("Klinik Hana Shah Alam")
                .icon(bitmapDescriptorFromVector(getApplicationContext(),R.drawable.ic_baseline_add_location_24)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hana));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(hana, 10));
    }
    private BitmapDescriptor bitmapDescriptorFromVector(Context context,int vectorResId){
        Drawable vectorDrawable= ContextCompat.getDrawable(context,vectorResId);
        vectorDrawable.setBounds(0,0,vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight());
        Bitmap bitmap=Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(),
                vectorDrawable.getIntrinsicHeight(),Bitmap.Config.ARGB_8888);
        Canvas canvas=new Canvas(bitmap);
        vectorDrawable.draw(canvas);
        return BitmapDescriptorFactory.fromBitmap(bitmap);
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}