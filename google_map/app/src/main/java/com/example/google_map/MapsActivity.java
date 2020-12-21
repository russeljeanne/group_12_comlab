package com.example.google_map;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Camera;
import android.graphics.Color;
import android.location.GpsSatellite;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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


        LatLng ucu_address = new LatLng(15.980704283884487, 120.56040146840273);
        mMap.addMarker(new MarkerOptions().position(ucu_address).title("San Vicente West, Urdaneta, Pangasinan").snippet("Urdaneta City University"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ucu_address));

        LatLng pinlac_address = new LatLng(16.00725615834133, 120.68832607902651);
        mMap.addMarker(new MarkerOptions().position(pinlac_address).title("Bantog, Asingan, Pangasinan").snippet("Russel's address"));

        LatLng analyn_address = new LatLng(16.10614874277066, 120.7423909367999);
        mMap.addMarker(new MarkerOptions().position(analyn_address).title("San Nicolas, Pangasinan").snippet("Analyns's address"));


        LatLng obra_address = new LatLng(16.079294954026217, 120.57814752836747);
        mMap.addMarker(new MarkerOptions().position(obra_address).title("06# Zone 1 Vacante, Binalonan, Pangasinan").snippet("Remars's address"));

        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(ucu_address,11),1000,null);

        mMap.addPolyline(new PolylineOptions().add(new LatLng(16.00725615834133, 120.68832607902651),
                new LatLng(16.007739423341143, 120.68790964502978),
                new LatLng(16.006903463043905, 120.6864455218378),
                new LatLng(16.00556492505568, 120.68400511195865),
                new LatLng(16.005087951387143, 120.68220266749897),
                new LatLng(16.003952072709005, 120.68135162929947),
                new LatLng(16.003300456750313, 120.68063342011281),
                new LatLng(16.002863537854616, 120.67991459466792),
                new LatLng(16.00187241671707, 120.6785151586928),
                new LatLng(16.001660934714383, 120.6764288896901),
                new LatLng(16.0011285824917, 120.67516574863994),
                new LatLng(16.00093218778788, 120.67445335679399),
                new LatLng(16.00116674331984, 120.67319770761226),
                new LatLng(16.00120542781228, 120.67276288930096),
                new LatLng(16.001401482478215, 120.67198796454706),
                new LatLng(16.00159485392054, 120.67164397033912),
                new LatLng(16.00191455900799, 120.67132086749758),
                new LatLng(16.00230139812246, 120.67101992268083),
                new LatLng(16.003541179166184, 120.67048989784934),
                new LatLng(16.003659134483865, 120.6701271290799),
                new LatLng(16.003660423612587, 120.67000642967442),
                new LatLng(16.00364044211597, 120.66976972472834),
                new LatLng(16.003343407808263, 120.6690085077935),
                new LatLng(16.003429779552864, 120.66875168627976),
                new LatLng(16.00355095775846, 120.66857466048438),
                new LatLng(16.004767892274863, 120.66808515733915),
                new LatLng(16.003955210807355, 120.66597049354732),
                new LatLng(16.002365324429235, 120.66252720771969),
                new LatLng(15.997511019589993, 120.65352169095286),
                new LatLng(15.994190992193156, 120.647517279459),
                new LatLng(15.993239636478844, 120.6458944715756),
                new LatLng(15.991440142037927, 120.6429580122572),
                new LatLng(15.981417966449456, 120.62914483101409),
                new LatLng(15.979532324616665, 120.62434886793176),
                new LatLng(15.979332329102416, 120.62343432164606),
                new LatLng(15.97910792438208, 120.62217502859333),
                new LatLng(15.978539347957971, 120.62004133132162),
                new LatLng(15.9784328586914, 120.61934342870667),
                new LatLng(15.97795843181792, 120.61641941776448),
                new LatLng(15.977586106237354, 120.61457787987528),
                new LatLng(15.97741512512122, 120.61354558092529),
                new LatLng(15.977283165993587, 120.61185112875391),
                new LatLng(15.977048512013102, 120.60859358553067),
                new LatLng(15.976906473222623, 120.6074194344099),
                new LatLng(15.976868438832064, 120.60663086495872),
                new LatLng(15.976616449896433, 120.6032307096974),
                new LatLng(15.976528777255007, 120.60207194801004),
                new LatLng(15.97643395322359, 120.60062051796677),
                new LatLng(15.976430085310394, 120.60040191793196),
                new LatLng(15.976453264454795, 120.59994326231919),
                new LatLng(15.976740779073532, 120.5966005593329),
                new LatLng(15.976809112080254, 120.59561820028009),
                new LatLng(15.976894850640958, 120.59404709634919),
                new LatLng(15.976953045899231, 120.5906384383019),
                new LatLng(15.976922827845883, 120.58887062169465),
                new LatLng(15.976956010827776, 120.587827714195),
                new LatLng(15.976908306686804, 120.58696739565339),
                new LatLng(15.976907017385543, 120.58697544228046),
                new LatLng(15.976782599762016, 120.58499865423559),
                new LatLng(15.976635111470669, 120.58299174746544),
                new LatLng(15.976575915228457, 120.58210428451767),
                new LatLng(15.976468044973705, 120.58055615262543),
                new LatLng(15.976136558674176, 120.57739607844215),
                new LatLng(15.975962802638838, 120.57578892268539),
                new LatLng(15.975800442791398, 120.57405057626335),
                new LatLng(15.975768160675397, 120.57214117689769),
                new LatLng(15.975838541870125, 120.56859167968685),
                new LatLng(15.975792999535935, 120.56720279911926),
                new LatLng(15.975713707045085, 120.56545064608012),
                new LatLng(15.975559634560831, 120.56374071357862),
                new LatLng(15.976683133977836, 120.56366962084324),
                new LatLng(15.978526453070229, 120.56347627083578),
                new LatLng(15.979067729871943, 120.56341281373486),
                new LatLng(15.979774431457937, 120.56341661382426),
                new LatLng(15.97998909369169, 120.56344819026349),//
                new LatLng(15.9802802080949, 120.56297439238769),
                new LatLng(15.98052074587593, 120.5625021003738),
                new LatLng(15.980695532716956, 120.56219429412678),
                new LatLng(15.981803088912345, 120.5601394753085),
                new LatLng(15.981550332671816, 120.56016661047873),
                new LatLng(15.980704283884487, 120.56040146840273)
        ).width(10)
        .color(Color.RED));

        // REMAR'S ROUT
        mMap.addPolyline(new PolylineOptions().add(new LatLng(16.079294954026217, 120.57814752836747),
                new LatLng(16.07880120126126, 120.5782469847946),
                new LatLng(16.07951776445515, 120.57935147053308),
                new LatLng(16.07997443629749, 120.57977889060774),
                new LatLng(16.080195109561547, 120.58012975783342),
                new LatLng(16.0804311070934, 120.580643299863),
                new LatLng(16.080513859406942, 120.58088890692072),
                new LatLng(16.080663664999246, 120.58159199789078),
                new LatLng(16.080828328180885, 120.58240085620714),
                new LatLng(16.078665257414677, 120.58369067981147),
                new LatLng(16.07792815186939, 120.58427003695789),
                new LatLng(16.076523145829192, 120.5858310760854),
                new LatLng(16.07351945635301, 120.58799171826148),
                new LatLng(16.072208449641398, 120.58872948591299),
                new LatLng(16.07098476392635, 120.58913316168248),
                new LatLng(16.068217414719715, 120.58949189914462),
                new LatLng(16.066365139543336, 120.58948395247872),
                new LatLng(16.064426810496435, 120.58934775330061),
                new LatLng(16.063397799700443, 120.58936195989494),
                new LatLng(16.06186178514516, 120.58957175697279),
                new LatLng(16.061555266171396, 120.58957813637747),
                new LatLng(16.060755249442217, 120.58947925561384),
                new LatLng(15.979238022165351, 120.57097279286052),
                new LatLng(15.978878982904206, 120.56565883373463),
                new LatLng(15.978878982904206, 120.56565883373463),
                new LatLng(15.97998909369169, 120.56344819026349)
        ).width(10)
                .color(Color.RED));


        //ANALYN'S ROUT
        mMap.addPolyline(new PolylineOptions().add(new LatLng(16.10614874277066, 120.7423909367999),
                new LatLng(16.10619009321968, 120.74175559768244),
                new LatLng(16.106473555326374, 120.74179314860872),
                new LatLng(16.106602401604647, 120.74209355601909),
                new LatLng(16.10698378610266, 120.74227058181421),
                new LatLng(16.107120362803748, 120.74261926898691),
                new LatLng(16.107019862976234, 120.74279361257327),
                new LatLng(16.10665651702125, 120.74288480767997),
                new LatLng(16.106123093018162, 120.74281775245358),
                new LatLng(16.105800976387503, 120.74325763473298),
                new LatLng(16.10539897409895, 120.74338101634795),
                new LatLng(16.10525208843168, 120.74354463109717),
                new LatLng(16.104955739845646, 120.74387454280611),
                new LatLng(16.104640063676428, 120.74396707902685),
                new LatLng(16.104222597302883, 120.74393757472686),
                new LatLng(16.104106634265495, 120.7439000237996),
                new LatLng(16.103926247171646, 120.7438195575314),
                new LatLng(16.103078425691187, 120.74346818814072),
                new LatLng(16.10251827209631, 120.74330942781559),
                new LatLng(16.101675851218044, 120.74371981064331),
                new LatLng(16.10115529881776, 120.74414091747032),
                new LatLng(16.100320350511804, 120.74458348195289),
                new LatLng(16.099931222170433, 120.74483560960083),
                new LatLng(16.09951761141144, 120.74492546359214),
                new LatLng(16.099084672130257, 120.74494960347333),
                new LatLng(16.09847837966139, 120.74512052618014),
                new LatLng(16.0982430348069, 120.74510749692138),
                new LatLng(16.097955112530997, 120.74510489106963),
                new LatLng(16.0970287510532, 120.74521173099168),
                new LatLng(16.096825952412477, 120.7453680820965),
                new LatLng(16.095637509350063, 120.7456368340846),
                new LatLng(16.095294991911327, 120.74567953067996),
                new LatLng(16.094675068662568, 120.74428229756309),
                new LatLng(16.094509820903667, 120.74413819883182),
                new LatLng(16.088905845916916, 120.74339756158892),
                new LatLng(16.08843490688758, 120.74368132436767),
                new LatLng(16.088286189067418, 120.74368869482947),
                new LatLng(16.080264683471945, 120.75024696362395),
                new LatLng(16.07985451758114, 120.75057542285067),
                new LatLng(16.07670369558583, 120.75431727720974),
                new LatLng(16.07516103107055, 120.75440657048756),
                new LatLng(16.07228699268633, 120.75837889519664),
                new LatLng(16.070407694419664, 120.75990913456648),
                new LatLng(16.070176258337007, 120.75960696640827),
                new LatLng(16.0682938878896, 120.76110149870672),
                new LatLng(16.06799156976775, 120.76087693416686),
                new LatLng(16.06779310789824, 120.7607911034782),
                new LatLng(16.054758469606856, 120.75732897381486),
                new LatLng(16.052326128406122, 120.75667106332665),
                new LatLng(16.050899405909743, 120.7562626970024),
                new LatLng(16.049997799185896, 120.75603578603511),
                new LatLng(16.049147920869487, 120.75576215325182),
                new LatLng(16.048503660566926, 120.75546288063447),
                new LatLng(16.046958709840446, 120.75465534613524),
                new LatLng(16.045501811169355, 120.75389468712915),
                new LatLng(16.043181746115156, 120.75261368060805),
                new LatLng(16.030707397867204, 120.74536235428889),
                new LatLng(16.02993253970726, 120.74519942195134),
                new LatLng(16.02962439281828, 120.7451979774496),
                new LatLng(16.028782805172863, 120.7453784512976),
                new LatLng(16.026299540904205, 120.74591809978428),
                new LatLng(16.025605011556184, 120.74618507840079),
                new LatLng(16.024561930994146, 120.74671267909174),
                new LatLng(16.02328288656726, 120.74740256666065),
                new LatLng(16.015097388849004, 120.73840469070008),
                new LatLng(16.01468385393783, 120.7380453163563),
                new LatLng(16.013617804491943, 120.73732868453418),
                new LatLng(16.010909107924874, 120.73545110426777),
                new LatLng(16.00954754792861, 120.73470171302924),
                new LatLng(16.00758665404861, 120.7337454388584),
                new LatLng(16.007038531839328, 120.73342968737188),
                new LatLng(16.00667888730185, 120.7331797790619),
                new LatLng(16.004654925695036, 120.73160546895083),
                new LatLng(15.996694036760296, 120.72519958286972),
                new LatLng(15.996242459344266, 120.72478634899754),
                new LatLng(15.995400618847828, 120.7238675364746),
                new LatLng(15.99517036258436, 120.72357239156675),
                new LatLng(15.994422019382915, 120.72248390942767),
                new LatLng(15.993043657690945, 120.71955190569325),
                new LatLng(15.991502330029654, 120.7147210167457),
                new LatLng(15.990966304313602, 120.71388461253513),
                new LatLng(15.991482263725619, 120.71236423804955),
                new LatLng(15.99145432759354, 120.711973735174),
                new LatLng(15.989045163022904, 120.70398753640013),
                new LatLng(15.987912643550265, 120.70129876023437),
                new LatLng(15.985823744802762, 120.69796992308362),
                new LatLng(15.984480289459803, 120.69574772657818),
                new LatLng(15.983173044501266, 120.69435160268341),
                new LatLng(15.98182432681106, 120.69357287675193),
                new LatLng(15.982112306554814, 120.69312939827488),
                new LatLng(15.982218361186769, 120.6930040983326),
                new LatLng(15.982506689179836, 120.69271529065333),
                new LatLng(15.98857852944321, 120.68710055043107),
                new LatLng(15.989235831787465, 120.68653765255411),
                new LatLng(15.989877381275347, 120.6862174650286),
                new LatLng(15.990442358677948, 120.68611177841913),
                new LatLng(15.990815092611584, 120.68609298059056),
                new LatLng(15.99133572723544, 120.686169391996),
                new LatLng(15.9957882254198, 120.68729895130552),
                new LatLng(15.999185679992063, 120.68735018212881),
                new LatLng(15.99977773249736, 120.68731830552805),
                new LatLng(16.005143381333433, 120.6867648095329),
                new LatLng(16.006903463043905, 120.6864455218378)
        ).width(10)
                .color(Color.RED));

    }
}