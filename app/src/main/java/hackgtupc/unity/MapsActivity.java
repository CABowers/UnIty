package hackgtupc.unity;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import static hackgtupc.unity.R.id.map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        //setContentView(R.layout.map2);

         //Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        //SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
          //  .findFragmentById(R.id.mapView3);
        mapFragment.getMapAsync(this);
    }


    public void sabsMode(View v){
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(new LatLng(41.406167, 2.175490));

        mMap.moveCamera(center);

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(mMap.getCameraPosition())
                .bearing(0)
                .tilt(0)
                .build()));

        CameraUpdate zoom=CameraUpdateFactory.zoomTo(18);
        mMap.animateCamera(zoom);

        Toast.makeText(getBaseContext(), "L'Eixample", Toast.LENGTH_SHORT)
                .show();


        new CountDownTimer(1000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(mMap.getCameraPosition())
                        .bearing(0)
                        .tilt(0)
                        .zoom(15)
                        .build()));
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();
        //zoom=CameraUpdateFactory.zoomTo(15);
        //mMap.animateCamera(zoom);
        //zoomout!!!!
        //*******************************************************
        /*

    move
 Zoom in
 toast
 wait
 zoom out

        */

        new CountDownTimer(3000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                CameraUpdate loc1=
                        CameraUpdateFactory.newLatLng(new LatLng(41.403577, 2.174339));

                mMap.moveCamera(loc1);

                Toast.makeText(getBaseContext(), "Sagrada Familia", Toast.LENGTH_SHORT)
                        .show();
                CameraUpdate zoomin2 = CameraUpdateFactory.zoomTo(18);
                mMap.animateCamera(zoomin2);

            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();
        new CountDownTimer(5000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(mMap.getCameraPosition())
                        .bearing(0)
                        .tilt(0)
                        .zoom(15)
                        .build()));
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();

        new CountDownTimer(7000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                CameraUpdate loc1=
                        CameraUpdateFactory.newLatLng(new LatLng(41.412215, 2.174290));

                mMap.moveCamera(loc1);

                Toast.makeText(getBaseContext(), "Hospital Sant Pau", Toast.LENGTH_SHORT)
                        .show();
                CameraUpdate zoomin2 = CameraUpdateFactory.zoomTo(18);
                mMap.animateCamera(zoomin2);

            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();
        new CountDownTimer(9000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder(mMap.getCameraPosition())
                        .bearing(0)
                        .tilt(0)
                        .zoom(15)
                        .build()));
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();
        /*
        new CountDownTimer(1000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(41.403577, 2.174339));
                mMap.moveCamera(center);
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();

        Toast.makeText(getBaseContext(), "Sagrada Familia", Toast.LENGTH_LONG)
                .show();
        zoom=CameraUpdateFactory.zoomTo(18);
        mMap.animateCamera(zoom);

        new CountDownTimer(1000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                CameraUpdate zoom=CameraUpdateFactory.zoomTo(15);
                mMap.animateCamera(zoom);
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();
        new CountDownTimer(1000, 1000) {
            public void onFinish() {
                // When timer is finished
                // Execute your code here
                CameraUpdate center = CameraUpdateFactory.newLatLng(new LatLng(41.412215, 2.174290));
                mMap.moveCamera(center);
                Toast.makeText(getBaseContext(), "Hospital Sant Pau", Toast.LENGTH_LONG)
                        .show();
                CameraUpdate zoom=CameraUpdateFactory.zoomTo(18);
                mMap.animateCamera(zoom);
            }

            public void onTick(long millisUntilFinished) {
                // millisUntilFinished    The amount of time until finished.
            }
        }.start();

*/


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
        //mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);

        //LocationSource a = (LocationSource) getSystemService(Context.LOCATION_SERVICE);
        //LocationManager b = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        //map.setLocationSource(a);

        Criteria criteria = new Criteria();
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        String provider = locationManager.getBestProvider(criteria, false);
        Location location = locationManager.getLastKnownLocation(provider);
        double lat =  location.getLatitude();
        double lng = location.getLongitude();
        LatLng coordinate = new LatLng(lat, lng);

        //CameraPosition.Builder x = CameraPosition.builder();
        //x.target(coordinate);
        //x.zoom(13);

        //Projection proj = map.getProjection();
        //Point focus = proj.toScreenLocation(coordinate);

        //map.animateCamera(CameraUpdateFactory.newLatLng(coordinate));
        //mMap.animateCamera(CameraUpdateFactory.zoomBy(13));
        CameraUpdate center=
                CameraUpdateFactory.newLatLng(new LatLng(lat,
                        lng));
        CameraUpdate zoom=CameraUpdateFactory.zoomTo(15);

        mMap.moveCamera(center);
        mMap.animateCamera(zoom);
        //map.moveCamera(CameraUpdateFactory.newLatLng(coordinate));


        ////LatLngBounds bounds = mMap.getProjection().getVisibleRegion().latLngBounds;
        /*
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        */
    }
}