package com.emreeyupoglu.istfind;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    // GoogleMap nesnesi atadık.

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // Harita fragmentını çağıran ve hazır olduğunda haberdar eden kod bloğu.

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    // Geri tuşuna basıldığında MapsActivity'den MainActivity2'ye geçişi sağlayan kod bloğu.

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        Intent fifthIntent = new Intent(MapsActivity.this,MainActivity2.class);
        startActivity(fifthIntent);
        finish();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Atadığımız GoogleMap nesnesine enlem ve boylam bilgilerini kullanarak LatLng sınıfı şeklinde koordinatlarımızı ekledik.
        // Ayrıca her birine Marker eklemesi de yaptık ve kamera hareketlerini de ayarladık.

        mMap = googleMap;

        LatLng galatakule = new LatLng(41.02567563810056, 28.97407475174276);
        mMap.addMarker(new MarkerOptions().position(galatakule).title("Galata Tower"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(galatakule));

        LatLng galatakopru = new LatLng(41.02016928461346,28.97321678615065);
        mMap.addMarker(new MarkerOptions().position(galatakopru).title("Galata Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(galatakopru));

        LatLng kizkulesi = new LatLng(41.0211358231542,29.00411391958035);
        mMap.addMarker(new MarkerOptions().position(kizkulesi).title("Maiden's Tower"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kizkulesi));

        LatLng sultanahmetcami = new LatLng(41.00542403085318,28.9768356194296);
        mMap.addMarker(new MarkerOptions().position(sultanahmetcami).title("The Blue Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sultanahmetcami));

        LatLng ayasofyacami = new LatLng(41.00849689027069,28.97991837256506);
        mMap.addMarker(new MarkerOptions().position(ayasofyacami).title("Hagia Sophia Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ayasofyacami,8));

        LatLng topkapisarayi = new LatLng(41.01153417350043,28.98340195373032);
        mMap.addMarker(new MarkerOptions().position(topkapisarayi).title("Topkapı Palace Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(topkapisarayi));

        LatLng beylerbeyisarayi = new LatLng(41.04250422010459,29.040056985718174);
        mMap.addMarker(new MarkerOptions().position(beylerbeyisarayi).title("Beylerbeyi Palace"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(beylerbeyisarayi));

        LatLng anadoluhisari = new LatLng(41.08223202483844,29.06690541216242);
        mMap.addMarker(new MarkerOptions().position(anadoluhisari).title("Anatolian Fortress"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(anadoluhisari));

        LatLng rumelihisari = new LatLng(41.0848373080209,29.05671281609944);
        mMap.addMarker(new MarkerOptions().position(rumelihisari).title("Rumelian Fortress"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumelihisari));

        LatLng haydarpasagari = new LatLng(40.9968312036104,29.019339246542827);
        mMap.addMarker(new MarkerOptions().position(haydarpasagari).title("Haydarpaşa Train Station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(haydarpasagari));

        LatLng kapalicarsi = new LatLng(41.010693642357225,28.968083207803545);
        mMap.addMarker(new MarkerOptions().position(kapalicarsi).title("Grand Bazaar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kapalicarsi));

        LatLng ayairini = new LatLng(41.00962362727183,28.981207630785875);
        mMap.addMarker(new MarkerOptions().position(ayairini).title("Hagia Irene"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ayairini));

        LatLng yerebatansarnici = new LatLng(41.00836931809654,28.97784063634049);
        mMap.addMarker(new MarkerOptions().position(yerebatansarnici).title("Basilica Cistern"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yerebatansarnici));

        LatLng dolmabahcesarayi = new LatLng(41.03917361397107,29.000458002449086);
        mMap.addMarker(new MarkerOptions().position(dolmabahcesarayi).title("Dolmabahçe Palace"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dolmabahcesarayi));

        LatLng denizmuzesi = new LatLng(41.04155020116579,29.00539807279588);
        mMap.addMarker(new MarkerOptions().position(denizmuzesi).title("Maritime Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(denizmuzesi));

        LatLng ataturkevimuzesi = new LatLng(41.042436460271894,29.001549749278837);
        mMap.addMarker(new MarkerOptions().position(ataturkevimuzesi).title("Atatürk House Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ataturkevimuzesi));

        LatLng ciragansarayi = new LatLng(41.043470270086544,29.015675365959034);
        mMap.addMarker(new MarkerOptions().position(ciragansarayi).title("Çırağan Palace"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ciragansarayi));

        LatLng yenicami = new LatLng(41.016852183701424,28.971773208338067);
        mMap.addMarker(new MarkerOptions().position(yenicami).title("New Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yenicami));

        LatLng suleymaniyecami = new LatLng(41.016177998469765,28.96415183982823);
        mMap.addMarker(new MarkerOptions().position(suleymaniyecami).title("Süleymaniye Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(suleymaniyecami));

        LatLng fatihcami = new LatLng(41.01943291045381,28.950099667414893);
        mMap.addMarker(new MarkerOptions().position(fatihcami).title("Fatih Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fatihcami));

        LatLng dolmabahcesaatkulesi = new LatLng(41.03779395007061,28.99629101738524);
        mMap.addMarker(new MarkerOptions().position(dolmabahcesaatkulesi).title("Dolmabahçe Clock Tower"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dolmabahcesaatkulesi));

        LatLng ortakoycami = new LatLng(41.04725099804524,29.027008116258056);
        mMap.addMarker(new MarkerOptions().position(ortakoycami).title("Ortaköy Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ortakoycami));

        LatLng pierrelotitepesi = new LatLng(41.05424186809573,28.933757297460485);
        mMap.addMarker(new MarkerOptions().position(pierrelotitepesi).title("Pierre Loti Hill"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(pierrelotitepesi));

        LatLng rahmikocmuzesi = new LatLng(41.0426209852463,28.94945727360517);
        mMap.addMarker(new MarkerOptions().position(rahmikocmuzesi).title("Rahmi Koç Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rahmikocmuzesi));

        LatLng yildizhamidiyecami = new LatLng(41.0493892,29.0098176);
        mMap.addMarker(new MarkerOptions().position(yildizhamidiyecami).title("Yıldız Hamidiye Cami"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yildizhamidiyecami));

        LatLng yildizsarayi = new LatLng(41.050478268499376,29.01273266141488);
        mMap.addMarker(new MarkerOptions().position(yildizsarayi).title("Yıldız Palace"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yildizsarayi));

        LatLng harbiyeaskerimuze = new LatLng(41.04799455819862,28.987767276916973);
        mMap.addMarker(new MarkerOptions().position(harbiyeaskerimuze).title("Harbiye Military Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(harbiyeaskerimuze));

        LatLng gulhaneparki = new LatLng(41.01318502916693,28.981389786846883);
        mMap.addMarker(new MarkerOptions().position(gulhaneparki).title("Gülhane Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gulhaneparki));

        LatLng otagtepe = new LatLng(41.0895213,29.0733009);
        mMap.addMarker(new MarkerOptions().position(otagtepe).title("Otağtepe Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(otagtepe));

        LatLng istanbulpark = new LatLng(40.95791311103577,29.41167503798295);
        mMap.addMarker(new MarkerOptions().position(istanbulpark).title("İstanbul Park Racing Circuit"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(istanbulpark));

        LatLng camlicatepesi = new LatLng(41.02775456118238,29.06840780068685);
        mMap.addMarker(new MarkerOptions().position(camlicatepesi).title("Çamlıca Hill"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(camlicatepesi));

        LatLng istiklalcaddesi = new LatLng(41.033949,28.978347);
        mMap.addMarker(new MarkerOptions().position(istiklalcaddesi).title("İstiklal Avenue"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(istiklalcaddesi));

        LatLng isthavalimani = new LatLng(41.259897418384874,28.742722579400542);
        mMap.addMarker(new MarkerOptions().position(isthavalimani).title("İstanbul Airport"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(isthavalimani));

        LatLng sabihahavalimani = new LatLng(40.905369898951506,29.31686023447582);
        mMap.addMarker(new MarkerOptions().position(sabihahavalimani).title("Sabiha Gökçen International Airport"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sabihahavalimani));

        LatLng rumelifeneri = new LatLng(41.23422542542984,29.112249154178457);
        mMap.addMarker(new MarkerOptions().position(rumelifeneri).title("Rumelian Lighthouse"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rumelifeneri));

        LatLng esenlerotogar = new LatLng(41.04014838016707,28.893606688605214);
        mMap.addMarker(new MarkerOptions().position(esenlerotogar).title("Esenler Coach Terminal"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(esenlerotogar));

        LatLng floryaataturk = new LatLng(40.9725844320517,28.782563808924408);
        mMap.addMarker(new MarkerOptions().position(floryaataturk).title("Florya Atatürk Sea Mansion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(floryaataturk));

        LatLng havacilikmuzesi = new LatLng(40.96422891109528,28.826237656851546);
        mMap.addMarker(new MarkerOptions().position(havacilikmuzesi).title("İstanbul Aviation Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(havacilikmuzesi));

        LatLng veliefendi = new LatLng(40.986494146713866,28.886551992291142);
        mMap.addMarker(new MarkerOptions().position(veliefendi).title("Veliefendi Hippodrome"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(veliefendi));

        LatLng yedikulezindanlari = new LatLng(40.993852368294654,28.92326688198865);
        mMap.addMarker(new MarkerOptions().position(yedikulezindanlari).title("Yedikule Dungeons Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yedikulezindanlari));

        LatLng beyazitkulesi = new LatLng(41.01276194071682,28.964848846375364);
        mMap.addMarker(new MarkerOptions().position(beyazitkulesi).title("Beyazıt Tower"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(beyazitkulesi));

        LatLng beyazitmeydani = new LatLng(41.01045987209331,28.963895258516114);
        mMap.addMarker(new MarkerOptions().position(beyazitmeydani).title("Beyazıt Square"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(beyazitmeydani));

        LatLng taksimmeydani = new LatLng(41.01045987209331,28.963895258516114);
        mMap.addMarker(new MarkerOptions().position(taksimmeydani).title("Taksim Square and Republic Monument"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(taksimmeydani));

        LatLng dolmabahcecami = new LatLng(41.01045987209331,28.963895258516114);
        mMap.addMarker(new MarkerOptions().position(dolmabahcecami).title("Dolmabahçe Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dolmabahcecami));

        LatLng nusretiyecami = new LatLng(41.027378790922484,28.983115538588848);
        mMap.addMarker(new MarkerOptions().position(nusretiyecami).title("Nusteriye Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nusretiyecami));

        LatLng kilicalipasacami = new LatLng(41.026425864852946,28.98076009264698);
        mMap.addMarker(new MarkerOptions().position(kilicalipasacami).title("Kılıç Ali Paşa Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kilicalipasacami));

        LatLng tophanecesmesi = new LatLng(41.02668916720474,28.981203658109354);
        mMap.addMarker(new MarkerOptions().position(tophanecesmesi).title("Tophane Fountain"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tophanecesmesi));

        LatLng tophanekasri = new LatLng(41.02715242936278,28.982324184135436);
        mMap.addMarker(new MarkerOptions().position(tophanekasri).title("Tophane Pavilion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(tophanekasri));

        LatLng osmanlibankasimuzesi = new LatLng(41.02389416259476,28.973533955440306);
        mMap.addMarker(new MarkerOptions().position(osmanlibankasimuzesi).title("Ottoman Bank Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(osmanlibankasimuzesi));

        LatLng stantuankilisesi = new LatLng(41.03237405527066,28.9768792285841);
        mMap.addMarker(new MarkerOptions().position(stantuankilisesi).title("Church of St. Anthony of Padua"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(stantuankilisesi));

        LatLng cemiltopuzlu = new LatLng(41.046059550102434,28.990029725441175);
        mMap.addMarker(new MarkerOptions().position(cemiltopuzlu).title("Cemil Topuzlu Open Air Theatre"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cemiltopuzlu));

        LatLng beylerbeyicami = new LatLng(41.04513868984532,29.04571630538957);
        mMap.addMarker(new MarkerOptions().position(beylerbeyicami).title("Beylerbeyi Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(beylerbeyicami));

        LatLng kucuksukasri = new LatLng(41.078415637609474,29.064878863971696);
        mMap.addMarker(new MarkerOptions().position(kucuksukasri).title("Küçüksu Pavilion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kucuksukasri));

        LatLng polonezkoy = new LatLng(41.108570806448036,29.166017657111915);
        mMap.addMarker(new MarkerOptions().position(polonezkoy).title("Polonezköy Nature Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(polonezkoy));

        LatLng cinilicami = new LatLng(41.0199248650019,29.02918955309741);
        mMap.addMarker(new MarkerOptions().position(cinilicami).title("Çinili Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cinilicami));

        LatLng ormedikilitas = new LatLng(41.005355661301714,28.97479395368136);
        mMap.addMarker(new MarkerOptions().position(ormedikilitas).title("Walled Obelisk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ormedikilitas));

        LatLng dikilitas = new LatLng(41.005904349291704,28.975363860752804);
        mMap.addMarker(new MarkerOptions().position(dikilitas).title("Obelisk of Theodosius"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(dikilitas));

        LatLng turkislammuzesi = new LatLng(41.006142124823285,28.97487865983636);
        mMap.addMarker(new MarkerOptions().position(turkislammuzesi).title("Museum of Turkish and Islamic Arts"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(turkislammuzesi));

        LatLng almancesmesi = new LatLng(41.00707788038187,28.976679855006843);
        mMap.addMarker(new MarkerOptions().position(almancesmesi).title("German Fountain"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(almancesmesi));

        LatLng sultanucuncuahmetcesmesi = new LatLng(41.00707788038187,28.976679855006843);
        mMap.addMarker(new MarkerOptions().position(sultanucuncuahmetcesmesi).title("Sultan Ahmet III Fountain"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sultanucuncuahmetcesmesi));

        LatLng sultanucuncuahmetcesmesi2 = new LatLng(41.00707788038187,28.976679855006843);
        mMap.addMarker(new MarkerOptions().position(sultanucuncuahmetcesmesi2).title("Sultan Ahmet III Fountain (Üsküdar)"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sultanucuncuahmetcesmesi2));

        LatLng mihrimahsultancami = new LatLng(41.026776961644316,29.015981078468897);
        mMap.addMarker(new MarkerOptions().position(mihrimahsultancami).title("Mihrimah Sultan Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mihrimahsultancami));

        LatLng fethipasa = new LatLng(41.031137625521204,29.025644218594394);
        mMap.addMarker(new MarkerOptions().position(fethipasa).title("Fethi Paşa Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fethipasa));

        LatLng trocki = new LatLng(40.87026883764278,29.116422209153104);
        mMap.addMarker(new MarkerOptions().position(trocki).title("Trotsky House"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(trocki));

        LatLng ayayorgi = new LatLng(40.84876096003393,29.118973640684136);
        mMap.addMarker(new MarkerOptions().position(ayayorgi).title("Aya Yorgi Church"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ayayorgi));

        LatLng oyuncakmuzesi = new LatLng(40.84876096003393,29.118973640684136);
        mMap.addMarker(new MarkerOptions().position(oyuncakmuzesi).title("İstanbul Toy Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(oyuncakmuzesi));

        LatLng kadikoyrihtim = new LatLng(40.99524977556534,29.023832529447702);
        mMap.addMarker(new MarkerOptions().position(kadikoyrihtim).title("Kadıköy Dock"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kadikoyrihtim));

        LatLng besiktas = new LatLng(41.039046878678754,28.9946565113445);
        mMap.addMarker(new MarkerOptions().position(besiktas).title("Beşiktaş Stadium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(besiktas));

        LatLng galatasaray = new LatLng(41.103194,28.991245);
        mMap.addMarker(new MarkerOptions().position(galatasaray).title("Galatasaray Stadium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(galatasaray));

        LatLng fenerbahce = new LatLng(40.98772082561936,29.036813364137537);
        mMap.addMarker(new MarkerOptions().position(fenerbahce).title("Fenerbahçe Stadium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fenerbahce));

        LatLng ataturkolimpiyat = new LatLng(41.07439341527107,28.76562149804598);
        mMap.addMarker(new MarkerOptions().position(ataturkolimpiyat).title("Atatürk Olympic Stadium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ataturkolimpiyat));

        LatLng arkeolojimuze = new LatLng(41.01168138103699,28.98132869951048);
        mMap.addMarker(new MarkerOptions().position(arkeolojimuze).title("İstanbul Archaeological Museums"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(arkeolojimuze));

        LatLng istanbulmodern = new LatLng(41.02996286238333,28.973298990399407);
        mMap.addMarker(new MarkerOptions().position(istanbulmodern).title("İstanbul Museum of Modern Art"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(istanbulmodern));

        LatLng miniaturk = new LatLng(41.05903875144165,28.9494115171138);
        mMap.addMarker(new MarkerOptions().position(miniaturk).title("MiniaTurk"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(miniaturk));

        LatLng istanbulakvaryum = new LatLng(40.96446716693666,28.799467435231374);
        mMap.addMarker(new MarkerOptions().position(istanbulakvaryum).title("İstanbul Aquarium"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(istanbulakvaryum));

        LatLng belgradormani = new LatLng(40.96446716693666,28.799467435231374);
        mMap.addMarker(new MarkerOptions().position(belgradormani).title("Belgrad Forest"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(belgradormani));

        LatLng galatamevlevihanesi = new LatLng(41.02803064173562,28.974959270128565);
        mMap.addMarker(new MarkerOptions().position(galatamevlevihanesi).title("Galata Mevlevi Monastery"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(galatamevlevihanesi));

        LatLng bagdatcaddesi = new LatLng(40.964840667495686,29.07248431019561);
        mMap.addMarker(new MarkerOptions().position(bagdatcaddesi).title("Bağdat Avenue"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bagdatcaddesi));

        LatLng panorama1453 = new LatLng(41.018215966082984,28.920342098532007);
        mMap.addMarker(new MarkerOptions().position(panorama1453).title("Panorama 1453 History Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(panorama1453));

        LatLng yoroskalesi = new LatLng(41.17879298772512,29.094951196650136);
        mMap.addMarker(new MarkerOptions().position(yoroskalesi).title("Yoros Castle"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yoroskalesi));

        LatLng sokullu = new LatLng(41.00472911239425,28.97221043672494);
        mMap.addMarker(new MarkerOptions().position(sokullu).title("Sokullu Mehmet Paşa Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sokullu));

        LatLng kucukayasofya = new LatLng(41.00279750889227,28.97238347358787);
        mMap.addMarker(new MarkerOptions().position(kucukayasofya).title("Little Hagia Sophia"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kucukayasofya));

        LatLng mackaparki = new LatLng(41.04223128195277,28.994774099689117);
        mMap.addMarker(new MarkerOptions().position(mackaparki).title("Maçka Democracy Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mackaparki));

        LatLng sirkecigari = new LatLng(41.04223128195277,28.994774099689117);
        mMap.addMarker(new MarkerOptions().position(sirkecigari).title("Sirkeci Train Station"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sirkecigari));

        LatLng sepetcilerkasri = new LatLng(41.0163799803556,28.98230411484422);
        mMap.addMarker(new MarkerOptions().position(sepetcilerkasri).title("Sepetçiler Pavilion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sepetcilerkasri));

        LatLng sarayburnuataturk = new LatLng(41.016252511482925,28.98614650480142);
        mMap.addMarker(new MarkerOptions().position(sarayburnuataturk).title("Sarayburnu Atatürk Monument"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sarayburnuataturk));

        LatLng cinilikosk = new LatLng(41.011896248829736,28.98135068868443);
        mMap.addMarker(new MarkerOptions().position(cinilikosk).title("Tiled Pavilion Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cinilikosk));

        LatLng eyupsultancami = new LatLng(41.047958130300486,28.933792198289513);
        mMap.addMarker(new MarkerOptions().position(eyupsultancami).title("Eyüp Sultan Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyupsultancami));

        LatLng demirkilise = new LatLng(41.03167307454265,28.94954499731694);
        mMap.addMarker(new MarkerOptions().position(demirkilise).title("Bulgarian St. Stephen Church"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(demirkilise));

        LatLng sehzadecami = new LatLng(41.03167307454265,28.957409018839865);
        mMap.addMarker(new MarkerOptions().position(sehzadecami).title("Şehzade Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sehzadecami));

        LatLng onbestemmuzkopru = new LatLng(41.04565354036441,29.034124092457297);
        mMap.addMarker(new MarkerOptions().position(onbestemmuzkopru).title("15 July Martyrs Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(onbestemmuzkopru));

        LatLng fatihsultanmehmetkopru = new LatLng(41.04565354036441,29.034124092457297);
        mMap.addMarker(new MarkerOptions().position(fatihsultanmehmetkopru).title("Fatih Sultan Mehmet Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(fatihsultanmehmetkopru));

        LatLng yavuzsultanselimkopru = new LatLng(41.20291086342904,29.112526893157643);
        mMap.addMarker(new MarkerOptions().position(yavuzsultanselimkopru).title("Yavuz Sultan Selim Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yavuzsultanselimkopru));

        LatLng aynalikavakkasri = new LatLng(41.037849878112894,28.95537489333898);
        mMap.addMarker(new MarkerOptions().position(aynalikavakkasri).title("Aynalı Kavak Pavilion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(aynalikavakkasri));

        LatLng cagalogluhamam = new LatLng(41.01060200901126,28.9753459442899);
        mMap.addMarker(new MarkerOptions().position(cagalogluhamam).title("Cağaloğlu Turkish Bath"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(cagalogluhamam));

        LatLng babiali = new LatLng(41.01225544534063,28.976059763445633);
        mMap.addMarker(new MarkerOptions().position(babiali).title("Bab-ı Ali"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(babiali));

        LatLng semsipasacami = new LatLng(41.025965572748014,29.011409663913454);
        mMap.addMarker(new MarkerOptions().position(semsipasacami).title("Şemsi Paşa Mosque"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(semsipasacami));

        LatLng abdulmecidefendikosku = new LatLng(41.028256509627596,29.041579965369642);
        mMap.addMarker(new MarkerOptions().position(abdulmecidefendikosku).title("Abdülmecid Efendi Mansion"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(abdulmecidefendikosku));

        LatLng salacaksahil = new LatLng(41.02274029671093,29.006755543695874);
        mMap.addMarker(new MarkerOptions().position(salacaksahil).title("Salacak Seaside"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(salacaksahil));

        LatLng buyukpostane = new LatLng(41.01444232037183,28.9738862023454);
        mMap.addMarker(new MarkerOptions().position(buyukpostane).title("The Grand Post Office"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(buyukpostane));

        LatLng sakipsabancimuzesi = new LatLng(41.10555183376544,29.056968739952882);
        mMap.addMarker(new MarkerOptions().position(sakipsabancimuzesi).title("Sakıp Sabancı Museum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sakipsabancimuzesi));

        LatLng emirgankorusu = new LatLng(41.10866740832891,29.053147097719165);
        mMap.addMarker(new MarkerOptions().position(emirgankorusu).title("Emirgan Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(emirgankorusu));

        LatLng sinanerdem = new LatLng(40.988114722322564,28.852735712628576);
        mMap.addMarker(new MarkerOptions().position(sinanerdem).title("Sinan Erdem Dome"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sinanerdem));

        LatLng yildizparki = new LatLng(41.04914586537569,29.015299704165653);
        mMap.addMarker(new MarkerOptions().position(yildizparki).title("Yıldız Park"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(yildizparki));

        LatLng modaiskele = new LatLng(40.978997164201324,29.025114805231812);
        mMap.addMarker(new MarkerOptions().position(modaiskele).title("Moda Pier"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(modaiskele));

    }
}