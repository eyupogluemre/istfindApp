package com.emreeyupoglu.istfind;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;

public class FinalMapsActivity extends FragmentActivity implements OnMapReadyCallback {

    // GoogleMap nesnesi atadık.

    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_maps);

        // Harita fragmentını çağıran ve hazır olduğunda haberdar eden kod bloğu.

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    // Geri tuşuna basıldığında FinalMapsActivity'den WizardActivity'ye geçişi sağlayan kod bloğu.

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        Intent eighthIntent = new Intent(FinalMapsActivity.this, WizardActivity.class);
        startActivity(eighthIntent);
        finish();

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;

        /* Yeni bir Intent atayarak WizardActivity'den putExtra metodu kullanarak gönderdiğimiz String ifademizi
        getStringExtra metoduyla okuduk ve alinansayi isimli String ifadeye atadık. */

        Intent seventhIntent = getIntent();
        String alinansayi = seventhIntent.getStringExtra("a");

        // alinansayi isimli String ifademizi parseInt metodunu kullanarak Integer'a çevirdik ve gelensayi ismindeki int değişkene atadık.

        int gelensayi = Integer.parseInt(alinansayi);

        // Bu aktiviteye de LatLng sınıfı şeklinde koordinatlarımızı ekledik.

        LatLng galatakule = new LatLng(41.02567563810056, 28.97407475174276);
        LatLng galatakopru = new LatLng(41.02016928461346,28.97321678615065);
        LatLng kizkulesi = new LatLng(41.0211358231542,29.00411391958035);
        LatLng sultanahmetcami = new LatLng(41.00542403085318,28.9768356194296);
        LatLng ayasofyacami = new LatLng(41.00849689027069,28.97991837256506);
        LatLng topkapisarayi = new LatLng(41.01153417350043,28.98340195373032);
        LatLng beylerbeyisarayi = new LatLng(41.04250422010459,29.040056985718174);
        LatLng anadoluhisari = new LatLng(41.08223202483844,29.06690541216242);
        LatLng rumelihisari = new LatLng(41.0848373080209,29.05671281609944);
        LatLng haydarpasagari = new LatLng(40.9968312036104,29.019339246542827);
        LatLng kapalicarsi = new LatLng(41.010693642357225,28.968083207803545);
        LatLng ayairini = new LatLng(41.00962362727183,28.981207630785875);
        LatLng yerebatansarnici = new LatLng(41.00836931809654,28.97784063634049);
        LatLng dolmabahcesarayi = new LatLng(41.03917361397107,29.000458002449086);
        LatLng denizmuzesi = new LatLng(41.04155020116579,29.00539807279588);
        LatLng ataturkevimuzesi = new LatLng(41.042436460271894,29.001549749278837);
        LatLng ciragansarayi = new LatLng(41.0435511,29.0158739);
        LatLng yenicami = new LatLng(41.016852183701424,28.971773208338067);
        LatLng suleymaniyecami = new LatLng(41.016177998469765,28.96415183982823);
        LatLng fatihcami = new LatLng(41.01943291045381,28.950099667414893);
        LatLng dolmabahcesaatkulesi = new LatLng(41.03779395007061,28.99629101738524);
        LatLng ortakoycami = new LatLng(41.04725099804524,29.027008116258056);
        LatLng pierrelotitepesi = new LatLng(41.05424186809573,28.933757297460485);
        LatLng rahmikocmuzesi = new LatLng(41.0426209852463,28.94945727360517);
        LatLng yildizhamidiyecami = new LatLng(41.0493892,29.0098176);
        LatLng yildizsarayi = new LatLng(41.050478268499376,29.01273266141488);
        LatLng harbiyeaskerimuze = new LatLng(41.04799455819862,28.987767276916973);
        LatLng gulhaneparki = new LatLng(41.01318502916693,28.981389786846883);
        LatLng otagtepe = new LatLng(41.0895213,29.0733009);
        LatLng istanbulpark = new LatLng(40.95791311103577,29.41167503798295);
        LatLng camlicatepesi = new LatLng(41.02775456118238,29.06840780068685);
        LatLng istiklalcaddesi = new LatLng(41.033949,28.978347);
        LatLng isthavalimani = new LatLng(41.259897418384874,28.742722579400542);
        LatLng sabihahavalimani = new LatLng(40.905369898951506,29.31686023447582);
        LatLng rumelifeneri = new LatLng(41.23422542542984,29.112249154178457);
        LatLng esenlerotogar = new LatLng(41.04014838016707,28.893606688605214);
        LatLng floryaataturk = new LatLng(40.9725844320517,28.782563808924408);
        LatLng havacilikmuzesi = new LatLng(40.96422891109528,28.826237656851546);
        LatLng veliefendi = new LatLng(40.986494146713866,28.886551992291142);
        LatLng yedikulezindanlari = new LatLng(40.993852368294654,28.92326688198865);
        LatLng beyazitkulesi = new LatLng(41.01276194071682,28.964848846375364);
        LatLng beyazitmeydani = new LatLng(41.01045987209331,28.963895258516114);
        LatLng taksimmeydani = new LatLng(41.01045987209331,28.963895258516114);
        LatLng dolmabahcecami = new LatLng(41.01045987209331,28.963895258516114);
        LatLng nusretiyecami = new LatLng(41.027378790922484,28.983115538588848);
        LatLng kilicalipasacami = new LatLng(41.026425864852946,28.98076009264698);
        LatLng tophanecesmesi = new LatLng(41.02668916720474,28.981203658109354);
        LatLng tophanekasri = new LatLng(41.02715242936278,28.982324184135436);
        LatLng osmanlibankasimuzesi = new LatLng(41.02389416259476,28.973533955440306);
        LatLng stantuankilisesi = new LatLng(41.03237405527066,28.9768792285841);
        LatLng cemiltopuzlu = new LatLng(41.046059550102434,28.990029725441175);
        LatLng beylerbeyicami = new LatLng(41.04513868984532,29.04571630538957);
        LatLng kucuksukasri = new LatLng(41.078415637609474,29.064878863971696);
        LatLng polonezkoy = new LatLng(41.108570806448036,29.166017657111915);
        LatLng cinilicami = new LatLng(41.0199248650019,29.02918955309741);
        LatLng ormedikilitas = new LatLng(41.005355661301714,28.97479395368136);
        LatLng dikilitas = new LatLng(41.005904349291704,28.975363860752804);
        LatLng turkislammuzesi = new LatLng(41.006142124823285,28.97487865983636);
        LatLng almancesmesi = new LatLng(41.00707788038187,28.976679855006843);
        LatLng sultanucuncuahmetcesmesi = new LatLng(41.00707788038187,28.976679855006843);
        LatLng sultanucuncuahmetcesmesi2 = new LatLng(41.00707788038187,28.976679855006843);
        LatLng mihrimahsultancami = new LatLng(41.026776961644316,29.015981078468897);
        LatLng fethipasa = new LatLng(41.031137625521204,29.025644218594394);
        LatLng trocki = new LatLng(40.87026883764278,29.116422209153104);
        LatLng ayayorgi = new LatLng(40.84876096003393,29.118973640684136);
        LatLng oyuncakmuzesi = new LatLng(40.84876096003393,29.118973640684136);
        LatLng kadikoyrihtim = new LatLng(40.99524977556534,29.023832529447702);
        LatLng besiktaspark = new LatLng(41.039046878678754,28.9946565113445);
        LatLng galatasaray = new LatLng(41.103194,28.991245);
        LatLng fenerbahce = new LatLng(40.98772082561936,29.036813364137537);
        LatLng ataturkolimpiyat = new LatLng(41.07439341527107,28.76562149804598);
        LatLng arkeolojimuze = new LatLng(41.01168138103699,28.98132869951048);
        LatLng istanbulmodern = new LatLng(41.02996286238333,28.973298990399407);
        LatLng miniaturk = new LatLng(41.05903875144165,28.9494115171138);
        LatLng istanbulakvaryum = new LatLng(40.96446716693666,28.799467435231374);
        LatLng belgradormani = new LatLng(40.96446716693666,28.799467435231374);
        LatLng galatamevlevihanesi = new LatLng(41.02803064173562,28.974959270128565);
        LatLng bagdatcaddesi = new LatLng(40.964840667495686,29.07248431019561);
        LatLng panorama1453 = new LatLng(41.018215966082984,28.920342098532007);
        LatLng yoroskalesi = new LatLng(41.17879298772512,29.094951196650136);
        LatLng sokullu = new LatLng(41.00472911239425,28.97221043672494);
        LatLng kucukayasofya = new LatLng(41.00279750889227,28.97238347358787);
        LatLng mackaparki = new LatLng(41.04223128195277,28.994774099689117);
        LatLng sirkecigari = new LatLng(41.04223128195277,28.994774099689117);
        LatLng sepetcilerkasri = new LatLng(41.0163799803556,28.98230411484422);
        LatLng sarayburnuataturk = new LatLng(41.016252511482925,28.98614650480142);
        LatLng cinilikosk = new LatLng(41.011896248829736,28.98135068868443);
        LatLng eyupsultancami = new LatLng(41.047958130300486,28.933792198289513);
        LatLng demirkilise = new LatLng(41.03167307454265,28.94954499731694);
        LatLng sehzadecami = new LatLng(41.03167307454265,28.957409018839865);
        LatLng onbestemmuzkopru = new LatLng(41.04565354036441,29.034124092457297);
        LatLng fatihsultanmehmetkopru = new LatLng(41.04565354036441,29.034124092457297);
        LatLng yavuzsultanselimkopru = new LatLng(41.20291086342904,29.112526893157643);
        LatLng aynalikavakkasri = new LatLng(41.037849878112894,28.95537489333898);
        LatLng cagalogluhamam = new LatLng(41.01060200901126,28.9753459442899);
        LatLng babiali = new LatLng(41.01225544534063,28.976059763445633);
        LatLng semsipasacami = new LatLng(41.025965572748014,29.011409663913454);
        LatLng abdulmecidefendikosku = new LatLng(41.028256509627596,29.041579965369642);
        LatLng salacaksahil = new LatLng(41.02274029671093,29.006755543695874);
        LatLng buyukpostane = new LatLng(41.01444232037183,28.9738862023454);
        LatLng sakipsabancimuzesi = new LatLng(41.10555183376544,29.056968739952882);
        LatLng emirgankorusu = new LatLng(41.10866740832891,29.053147097719165);
        LatLng sinanerdem = new LatLng(40.988114722322564,28.852735712628576);
        LatLng yildizparki = new LatLng(41.04914586537569,29.015299704165653);
        LatLng modaiskele = new LatLng(40.978997164201324,29.025114805231812);

        // locations isminde, LatLng tipinde bir Arraylist tanımlayarak yukarıda girmiş olduğumuz konumların tümünü bu listeye ekledik.

        ArrayList<LatLng> locations;
        locations = new ArrayList();
        locations.add(galatakule);
        locations.add(galatakopru);
        locations.add(kizkulesi);
        locations.add(sultanahmetcami);
        locations.add(ayasofyacami);
        locations.add(topkapisarayi);
        locations.add(beylerbeyisarayi);
        locations.add(anadoluhisari);
        locations.add(rumelihisari);
        locations.add(haydarpasagari);
        locations.add(kapalicarsi);
        locations.add(ayairini);
        locations.add(yerebatansarnici);
        locations.add(dolmabahcesarayi);
        locations.add(denizmuzesi);
        locations.add(ataturkevimuzesi);
        locations.add(ciragansarayi);
        locations.add(yenicami);
        locations.add(suleymaniyecami);
        locations.add(fatihcami);
        locations.add(dolmabahcesaatkulesi);
        locations.add(ortakoycami);
        locations.add(pierrelotitepesi);
        locations.add(rahmikocmuzesi);
        locations.add(yildizhamidiyecami);
        locations.add(yildizsarayi);
        locations.add(harbiyeaskerimuze);
        locations.add(gulhaneparki);
        locations.add(otagtepe);
        locations.add(istanbulpark);
        locations.add(camlicatepesi);
        locations.add(istiklalcaddesi);
        locations.add(isthavalimani);
        locations.add(sabihahavalimani);
        locations.add(rumelifeneri);
        locations.add(esenlerotogar);
        locations.add(floryaataturk);
        locations.add(havacilikmuzesi);
        locations.add(veliefendi);
        locations.add(yedikulezindanlari);
        locations.add(beyazitkulesi);
        locations.add(beyazitmeydani);
        locations.add(taksimmeydani);
        locations.add(dolmabahcecami);
        locations.add(nusretiyecami);
        locations.add(kilicalipasacami);
        locations.add(tophanecesmesi);
        locations.add(tophanekasri);
        locations.add(osmanlibankasimuzesi);
        locations.add(stantuankilisesi);
        locations.add(cemiltopuzlu);
        locations.add(beylerbeyicami);
        locations.add(kucuksukasri);
        locations.add(polonezkoy);
        locations.add(cinilicami);
        locations.add(ormedikilitas);
        locations.add(dikilitas);
        locations.add(turkislammuzesi);
        locations.add(almancesmesi);
        locations.add(sultanucuncuahmetcesmesi);
        locations.add(sultanucuncuahmetcesmesi2);
        locations.add(mihrimahsultancami);
        locations.add(fethipasa);
        locations.add(trocki);
        locations.add(ayayorgi);
        locations.add(oyuncakmuzesi);
        locations.add(kadikoyrihtim);
        locations.add(besiktaspark);
        locations.add(galatasaray);
        locations.add(fenerbahce);
        locations.add(ataturkolimpiyat);
        locations.add(arkeolojimuze);
        locations.add(istanbulmodern);
        locations.add(miniaturk);
        locations.add(istanbulakvaryum);
        locations.add(belgradormani);
        locations.add(galatamevlevihanesi);
        locations.add(bagdatcaddesi);
        locations.add(panorama1453);
        locations.add(yoroskalesi);
        locations.add(sokullu);
        locations.add(kucukayasofya);
        locations.add(mackaparki);
        locations.add(sirkecigari);
        locations.add(sepetcilerkasri);
        locations.add(sarayburnuataturk);
        locations.add(cinilikosk);
        locations.add(eyupsultancami);
        locations.add(demirkilise);
        locations.add(sehzadecami);
        locations.add(onbestemmuzkopru);
        locations.add(fatihsultanmehmetkopru);
        locations.add(yavuzsultanselimkopru);
        locations.add(aynalikavakkasri);
        locations.add(cagalogluhamam);
        locations.add(babiali);
        locations.add(semsipasacami);
        locations.add(abdulmecidefendikosku);
        locations.add(salacaksahil);
        locations.add(buyukpostane);
        locations.add(sakipsabancimuzesi);
        locations.add(emirgankorusu);
        locations.add(sinanerdem);
        locations.add(yildizparki);
        locations.add(modaiskele);

        // Arraylist'deki değerlerin indesklerini rastgele karıştıran kod.

        Collections.shuffle(locations);

            // Kullanıcının girdiği gün sayısı kadar konumun harita üzerinde işaretlemesini sağlayan for-each döngüsü kod bloğu.

            int i = 1;

            for (LatLng location : locations){

                if (i<=gelensayi) {

                    mMap.addMarker(new MarkerOptions().position(location).title("Here's one of the suggested places!"));
                    i++;

                }

                  else if (i>gelensayi)

                      break;

            }

    }

}