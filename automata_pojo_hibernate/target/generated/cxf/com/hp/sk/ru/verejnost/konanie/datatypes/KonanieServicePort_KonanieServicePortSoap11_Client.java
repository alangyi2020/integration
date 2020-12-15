
package com.hp.sk.ru.verejnost.konanie.datatypes;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2020-12-10T10:37:37.878+01:00
 * Generated source version: 3.3.0
 *
 */
public final class KonanieServicePort_KonanieServicePortSoap11_Client {

    private static final QName SERVICE_NAME = new QName("datatypes.konanie.verejnost.ru.sk.hp.com", "KonanieServicePortService");

    private KonanieServicePort_KonanieServicePortSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = KonanieServicePortService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        KonanieServicePortService ss = new KonanieServicePortService(wsdlURL, SERVICE_NAME);
        KonanieServicePort port = ss.getKonanieServicePortSoap11();

        {
        System.out.println("Invoking vyhladajKonanie...");
        com.hp.sk.ru.verejnost.konanie.datatypes.VyhladajKonanieRequest _vyhladajKonanie_vyhladajKonanieRequest = new com.hp.sk.ru.verejnost.konanie.datatypes.VyhladajKonanieRequest();
        com.hp.sk.ru.verejnost.konanie.datatypes.VyhladajKonanieResponse _vyhladajKonanie__return = port.vyhladajKonanie(_vyhladajKonanie_vyhladajKonanieRequest);
        System.out.println("vyhladajKonanie.result=" + _vyhladajKonanie__return);


        }
        {
        System.out.println("Invoking getKonaniePodlaICO...");
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonaniePodlaICORequest _getKonaniePodlaICO_getKonaniePodlaICORequest = new com.hp.sk.ru.verejnost.konanie.datatypes.GetKonaniePodlaICORequest();
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonaniePodlaICOResponse _getKonaniePodlaICO__return = port.getKonaniePodlaICO(_getKonaniePodlaICO_getKonaniePodlaICORequest);
        System.out.println("getKonaniePodlaICO.result=" + _getKonaniePodlaICO__return);


        }
        {
        System.out.println("Invoking vyhladajPoslednuZmenuOd...");
        com.hp.sk.ru.verejnost.konanie.datatypes.VyhladajPoslednuZmenuOdRequest _vyhladajPoslednuZmenuOd_vyhladajPoslednuZmenuOdRequest = new com.hp.sk.ru.verejnost.konanie.datatypes.VyhladajPoslednuZmenuOdRequest();
        com.hp.sk.ru.verejnost.konanie.datatypes.VyhladajPoslednuZmenuOdResponse _vyhladajPoslednuZmenuOd__return = port.vyhladajPoslednuZmenuOd(_vyhladajPoslednuZmenuOd_vyhladajPoslednuZmenuOdRequest);
        System.out.println("vyhladajPoslednuZmenuOd.result=" + _vyhladajPoslednuZmenuOd__return);


        }
        {
        System.out.println("Invoking getKonanieDetailPodlaZnackyASudu...");
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonanieDetailPodlaZnackyASuduRequest _getKonanieDetailPodlaZnackyASudu_getKonanieDetailPodlaZnackyASuduRequest = new com.hp.sk.ru.verejnost.konanie.datatypes.GetKonanieDetailPodlaZnackyASuduRequest();
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonanieDetailPodlaZnackyASuduResponse _getKonanieDetailPodlaZnackyASudu__return = port.getKonanieDetailPodlaZnackyASudu(_getKonanieDetailPodlaZnackyASudu_getKonanieDetailPodlaZnackyASuduRequest);
        System.out.println("getKonanieDetailPodlaZnackyASudu.result=" + _getKonanieDetailPodlaZnackyASudu__return);


        }
        {
        System.out.println("Invoking getKonaniePreObdobie...");
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonaniePreObdobieRequest _getKonaniePreObdobie_getKonaniePreObdobieRequest = new com.hp.sk.ru.verejnost.konanie.datatypes.GetKonaniePreObdobieRequest();
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonaniePreObdobieResponse _getKonaniePreObdobie__return = port.getKonaniePreObdobie(_getKonaniePreObdobie_getKonaniePreObdobieRequest);
        System.out.println("getKonaniePreObdobie.result=" + _getKonaniePreObdobie__return);


        }
        {
        System.out.println("Invoking getZoznamSudov...");
        com.hp.sk.ru.verejnost.konanie.datatypes.GetZoznamSudovRequest _getZoznamSudov_getZoznamSudovRequest = new com.hp.sk.ru.verejnost.konanie.datatypes.GetZoznamSudovRequest();
        com.hp.sk.ru.verejnost.konanie.datatypes.GetZoznamSudovResponse _getZoznamSudov__return = port.getZoznamSudov(_getZoznamSudov_getZoznamSudovRequest);
        System.out.println("getZoznamSudov.result=" + _getZoznamSudov__return);


        }
        {
        System.out.println("Invoking getKonanieDetail...");
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonanieDetailRequest _getKonanieDetail_getKonanieDetailRequest = new com.hp.sk.ru.verejnost.konanie.datatypes.GetKonanieDetailRequest();
        com.hp.sk.ru.verejnost.konanie.datatypes.GetKonanieDetailResponse _getKonanieDetail__return = port.getKonanieDetail(_getKonanieDetail_getKonanieDetailRequest);
        System.out.println("getKonanieDetail.result=" + _getKonanieDetail__return);


        }

        System.exit(0);
    }

}