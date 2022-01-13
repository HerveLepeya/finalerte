/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Plainte
 * Date : 24/10/2021 05:22:59
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Plainte extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Plainte
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Genre
 */
class GWDSEL_Genre extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte.SEL_Genre
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_Genre_Option_0
 */
class GWDSEL_Genre_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte.SEL_Genre.SEL_Genre_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Monsieur");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("Monsieur")));

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -7.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Genre_Option_0 mWD_SEL_Genre_Option_0 = new GWDSEL_Genre_Option_0();

/**
 * SEL_Genre_Option_1
 */
class GWDSEL_Genre_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plainte.SEL_Genre.SEL_Genre_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Personne Morale");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("Personne Morale")));

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -7.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Genre_Option_1 mWD_SEL_Genre_Option_1 = new GWDSEL_Genre_Option_1();

/**
 * SEL_Genre_Option_2
 */
class GWDSEL_Genre_Option_2 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Plainte.SEL_Genre.SEL_Genre_Option_2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Madame");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("Madame")));

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -7.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Genre_Option_2 mWD_SEL_Genre_Option_2 = new GWDSEL_Genre_Option_2();
/**
 * Initialise tous les champs de FEN_Plainte.SEL_Genre
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte.SEL_Genre
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_Genre_Option_0);
super.ajouterOption(mWD_SEL_Genre_Option_1);
super.ajouterOption(mWD_SEL_Genre_Option_2);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,300,79);
super.setQuid(2376385678117647893l);

super.setChecksum("578936564");

super.setNom("SEL_Genre");

super.setType(6);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(12, 75);

super.setTailleInitiale(300, 79);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(true, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x212121, creerPolice_GEN("Roboto", -7.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));


super.setImageCoche("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Radio@dpi160.png?E12_8O", 1);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_Genre mWD_SEL_Genre;

/**
 * SAI_Noms
 */
class GWDSAI_Noms extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plainte.SAI_Noms
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,300,39);
super.setQuid(2376386416877885292l);

super.setChecksum("604797399");

super.setNom("SAI_Noms");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(12, 186);

super.setTailleInitiale(300, 43);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("2"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("< Nom, Post-nom et Prénom >");

super.setNumTab(2);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Edt@dpi160.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Noms mWD_SAI_Noms;

/**
 * IMG_Localisation2
 */
class GWDIMG_Localisation2 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Plainte.IMG_Localisation2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376387250105142713l);

super.setChecksum("608402326");

super.setNom("IMG_Localisation2");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(12, 265);

super.setTailleInitiale(25, 25);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\IOB13150@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(true);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(false);

super.setOrientationExif(false);

super.setParamAnimation(1, 1, false, 300, true, false);

super.setAnimationInitiale(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDIMG_Localisation2 mWD_IMG_Localisation2;

/**
 * SAI_Telephone
 */
class GWDSAI_Telephone extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Plainte.SAI_Telephone
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,221,36);
super.setQuid(2376387293055743349l);

super.setChecksum("609327276");

super.setNom("SAI_Telephone");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(14);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(91, 260);

super.setTailleInitiale(221, 40);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("21"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("< 8.90.00.00.00 >");

super.setNumTab(4);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Edt@dpi160.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Telephone mWD_SAI_Telephone;

/**
 * COMBO_Province
 */
class GWDCOMBO_Province extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Plainte.COMBO_Province
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,300,40);
super.setQuid(2376389483491933667l);

super.setChecksum("625130628");

super.setNom("COMBO_Province");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(12, 404);

super.setTailleInitiale(300, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(6);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Combo@dpi160.png?E5_3NP_32_6_42_6", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {6, 42, 6, 32}, 0xFFFFFFFF, 1, 5));

super.setStyleElement(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 48);

super.setStyleSelection(0x222222, 0xE2E2E2, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de COMBO_Province
 */
public void selectionLigne()
{
super.selectionLigne();

// HLitRecherchePremier(t_province,LibelleVille,COMBO_Province..ValeurAffichée, Options)
// HLitRecherchePremier(t_province,LibelleVille,COMBO_Province..ValeurAffichée, Options)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_province"),WDAPIHF.getRubriqueSansCasseNiAccent("libelleville"),this.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// SI HTrouve(t_province) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_province")).getBoolean())
{
// 	HExécuteRequête(REQ_CommuneByProvince,hRequêteDéfaut,t_province.ProvinceId)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_communebyprovince"),new WDEntier4(0),new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("t_province").getRubriqueSansCasseNiAccent("provinceid")} );

// 	ListeSupprimeTout(COMBO_Commune)
WDAPIListe.listeSupprimeTout(mWD_COMBO_Commune);

// 	ListeAjoute(COMBO_Commune,"Sélectionnez votre commune")
WDAPIListe.listeAjoute(mWD_COMBO_Commune,"Sélectionnez votre commune");

// 	HLitPremier(REQ_CommuneByProvince, REQ_CommuneByProvince.LibelleTerritoire)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_communebyprovince"),WDAPIHF.getFichierSansCasseNiAccent("req_communebyprovince").getRubriqueSansCasseNiAccent("libelleterritoire"));

// 	TANTQUE PAS HEnDehors()
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 		ListeAjoute(COMBO_Commune, REQ_CommuneByProvince.LibelleTerritoire)
WDAPIListe.listeAjoute(mWD_COMBO_Commune,WDAPIHF.getFichierSansCasseNiAccent("req_communebyprovince").getRubriqueSansCasseNiAccent("libelleterritoire").getString());

// 		HLitSuivant(REQ_CommuneByProvince, REQ_CommuneByProvince.LibelleTerritoire)
WDAPIHF.hLitSuivant(WDAPIHF.getRequeteSansCasseNiAccent("req_communebyprovince"),WDAPIHF.getFichierSansCasseNiAccent("req_communebyprovince").getRubriqueSansCasseNiAccent("libelleterritoire"));

}

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_Province mWD_COMBO_Province;

/**
 * COMBO_Commune
 */
class GWDCOMBO_Commune extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Plainte.COMBO_Commune
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,300,40);
super.setQuid(2376389483492195827l);

super.setChecksum("627632788");

super.setNom("COMBO_Commune");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(12, 474);

super.setTailleInitiale(300, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setRetourneValeurProgrammation(false);

super.setPersistant(false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -2, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Combo@dpi160.png?E5_3NP_32_6_42_6", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {6, 42, 6, 32}, 0xFFFFFFFF, 1, 5));

super.setStyleElement(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -7.000000, 0), 48);

super.setStyleSelection(0x222222, 0xE2E2E2, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleBouton(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0xFFFFFFFF);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDCOMBO_Commune mWD_COMBO_Commune;

/**
 * SAI_Adresse
 */
class GWDSAI_Adresse extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Plainte.SAI_Adresse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,300,42);
super.setQuid(2376666144459039186l);

super.setChecksum("1260995238");

super.setNom("SAI_Adresse");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(12, 551);

super.setTailleInitiale(300, 46);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(7);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("< N°, Rue et Quartier >");

super.setNumTab(8);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Edt@dpi160.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Adresse mWD_SAI_Adresse;

/**
 * BTN_Suivant
 */
class GWDBTN_Suivant extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Plainte.BTN_Suivant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376666496674029880l);

super.setChecksum("1288668654");

super.setNom("BTN_Suivant");

super.setType(4);

super.setBulle("");

super.setLibelle("SUIVANT");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(19, 604);

super.setTailleInitiale(282, 47);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(8);

super.setAncrageInitial(9, 1000, 1000, 1000, 1000, 0);

super.setNumTab(9);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\WPS01330c@dpi1x.png?E5", 0, 1, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 0, 0x222222);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xE8C6B0, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,2,1,2,2,2,1,2,1}, 10, 10, 10, 10);

super.setImageFond("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Btn_Std@dpi160.png?E5_3NP_10_10_10_10", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_Suivant
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// SI SEL_Genre=-1 ALORS
// SI SEL_Genre=-1 ALORS
if(mWD_SEL_Genre.opEgal(-1))
{
// 	UnePlainte.Civilite="ANONYME"
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_Civilite.setValeur("ANONYME");

}
else
{
// 	UnePlainte.Civilite=SEL_Genre..Valeur
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_Civilite.setValeur(mWD_SEL_Genre.getProp(EWDPropriete.PROP_VALEUR));

}

// SI SAI_Noms="" ALORS
if(mWD_SAI_Noms.opEgal(""))
{
// 	Erreur("Vous devez saisir le nom avant de continuer!")
WDAPIDialogue.erreur("Vous devez saisir le nom avant de continuer!");

// 	DonneFocus(SAI_Noms)
WDAPIDivers.donneFocus(mWD_SAI_Noms);

}

// SI SAI_Adresse="" ALORS
if(mWD_SAI_Adresse.opEgal(""))
{
// 	Erreur("Vous devez saisir l'adresse du plaignant avant de continuer!")
WDAPIDialogue.erreur("Vous devez saisir l'adresse du plaignant avant de continuer!");

// 	DonneFocus(SAI_Noms)
WDAPIDivers.donneFocus(mWD_SAI_Noms);

}

// UnePlainte.Adresse=SAI_Adresse
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_Adresse.setValeur(mWD_SAI_Adresse);

// UnePlainte.Email=SAI_Email
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_Email.setValeur(mWD_SAI_Email);

// HLitRecherchePremier(t_province,LibelleVille,COMBO_Province..ValeurAffichée)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_province"),WDAPIHF.getRubriqueSansCasseNiAccent("libelleville"),mWD_COMBO_Province.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// SI HTrouve(t_province) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_province")).getBoolean())
{
// 	UnePlainte.ProvinceId=t_province.ProvinceId
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_ProvinceId.setValeur(WDAPIHF.getFichierSansCasseNiAccent("t_province").getRubriqueSansCasseNiAccent("provinceid"));

}

// HLitRecherchePremier(t_territoire,LibelleTerritoire,COMBO_Commune..ValeurAffichée)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_territoire"),WDAPIHF.getRubriqueSansCasseNiAccent("libelleterritoire"),mWD_COMBO_Commune.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// SI HTrouve(t_territoire) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_territoire")).getBoolean())
{
// 	UnePlainte.TerritoireId=t_territoire.TerritoireId
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_TerritoireId.setValeur(WDAPIHF.getFichierSansCasseNiAccent("t_territoire").getRubriqueSansCasseNiAccent("territoireid"));

}

// UnePlainte.Noms=SAI_Noms//Crypte(sHash1,"",crypteAucun,encodeBASE64)
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_Noms.setValeur(mWD_SAI_Noms);

// UnePlainte.Telephone="243"+Remplace(SAI_Telephone,".","")
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_Telephone.setValeur(new WDChaineU("243").opPlus(WDAPIChaine.remplace(mWD_SAI_Telephone,new WDChaineU("."),new WDChaineU(""))));

// SI SAI_Noms<>"" ET SAI_Adresse<>"" ALORS
if((mWD_SAI_Noms.opDiff("") & mWD_SAI_Adresse.opDiff("")))
{
// 	OuvreFenêtreMobile(FEN_Plainte_MOBILE_2)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Plainte_MOBILE_2);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurClic();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDBTN_Suivant mWD_BTN_Suivant;

/**
 * LIB_Informations_sur_le_plaignant
 */
class GWDLIB_Informations_sur_le_plaignant extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Plainte.LIB_Informations_sur_le_plaignant
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376666831695450865l);

super.setChecksum("1302640173");

super.setNom("LIB_Informations_sur_le_plaignant");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Informations sur le plaignant");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-4, 8);

super.setTailleInitiale(327, 28);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xFFFFFF, 0xF39621, creerPolice_GEN("Roboto", -9.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xF39621, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Informations_sur_le_plaignant mWD_LIB_Informations_sur_le_plaignant;

/**
 * SAI_Email
 */
class GWDSAI_Email extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Plainte.SAI_Email
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,300,36);
super.setQuid(2377186114056679574l);

super.setChecksum("643066451");

super.setNom("SAI_Email");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(260);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(12, 332);

super.setTailleInitiale(300, 40);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("17"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(10);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("< Entrez votre Émail (Facultatif)>");

super.setNumTab(5);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Edt@dpi160.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -8.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Email mWD_SAI_Email;

/**
 * SAI_Indicatif
 */
class GWDSAI_Indicatif extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Plainte.SAI_Indicatif
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,49,38);
super.setQuid(2377187277997413338l);

super.setChecksum("647663270");

super.setNom("SAI_Indicatif");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(9);

super.setNavigable(true);

super.setEtatInitial(1);

super.setPositionInitiale(43, 258);

super.setTailleInitiale(49, 42);

super.setValeurInitiale("+243");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("5"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("< 243890000000 >");

super.setNumTab(3);

super.setModeAscenseur(2, 2);

super.setEffacementAutomatique(true);

super.setFinSaisieAutomatique(false);

super.setLettreAppel(65535);

super.setSelectionEnAffichage(true);

super.setPersistant(false);

super.setClavierEnSaisie(true);

super.setMasqueAffichage(new WDChaineU(""));

super.setParamBtnActionClavier(0, "");

super.setRetraitGauche(2);

super.setMiseABlancSiZero(false);

super.setVerifieOrthographe(true);

super.setTauxParallaxe(0, 0);

super.setBoutonSuppression(0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -5.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF2000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Edt@dpi160.png?E5_3NP_8_8_8_8", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {8, 8, 8, 8}, 0xFFFFFFFF, 1, 5));

super.setStyleSaisie(0x222222, creerPolice_GEN("Roboto", -7.000000, 0));

super.setStyleTexteIndication(0x8E8E8F, creerPolice_GEN("Roboto", -8.000000, 0), 0);

super.setStyleJeton(WDCadreFactory.creerCadre_GEN(2, 0xF39621, 0x731600, 0xF39621, 4.000000, 4.000000, 1, 1), 0xFFFFFF, 0xFF000001, "", 1);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSAI_Indicatif mWD_SAI_Indicatif;

/**
 * LIB_Statut_de_l_accusé2
 */
class GWDLIB_Statut_de_l_accuse2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Plainte.LIB_Statut_de_l_accusé2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378574814364482137l);

super.setChecksum("585442530");

super.setNom("LIB_Statut_de_l_accusé2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Civilité du Plaignant :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(12, 49);

super.setTailleInitiale(184, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(12);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statut_de_l_accuse2 mWD_LIB_Statut_de_l_accuse2;

/**
 * LIB_Statut_de_l_accusé3
 */
class GWDLIB_Statut_de_l_accuse3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_Plainte.LIB_Statut_de_l_accusé3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378575986894497226l);

super.setChecksum("589386084");

super.setNom("LIB_Statut_de_l_accusé3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Noms du Plaignant :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(12, 160);

super.setTailleInitiale(300, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(13);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statut_de_l_accuse3 mWD_LIB_Statut_de_l_accuse3;

/**
 * LIB_Statut_de_l_accusé4
 */
class GWDLIB_Statut_de_l_accuse4 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_Plainte.LIB_Statut_de_l_accusé4
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378577318335913467l);

super.setChecksum("590940875");

super.setNom("LIB_Statut_de_l_accusé4");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Téléphone du Plaignant :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(12, 237);

super.setTailleInitiale(300, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statut_de_l_accuse4 mWD_LIB_Statut_de_l_accuse4;

/**
 * LIB_Statut_de_l_accusé5
 */
class GWDLIB_Statut_de_l_accuse5 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de FEN_Plainte.LIB_Statut_de_l_accusé5
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378578469392135544l);

super.setChecksum("595927892");

super.setNom("LIB_Statut_de_l_accusé5");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Émail du Plaignant :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(12, 309);

super.setTailleInitiale(300, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statut_de_l_accuse5 mWD_LIB_Statut_de_l_accuse5;

/**
 * LIB_Statut_de_l_accusé6
 */
class GWDLIB_Statut_de_l_accuse6 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°16 de FEN_Plainte.LIB_Statut_de_l_accusé6
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378578873121645517l);

super.setChecksum("598512135");

super.setNom("LIB_Statut_de_l_accusé6");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Province du Plaignant :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(12, 378);

super.setTailleInitiale(300, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(16);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statut_de_l_accuse6 mWD_LIB_Statut_de_l_accuse6;

/**
 * LIB_Statut_de_l_accusé7
 */
class GWDLIB_Statut_de_l_accuse7 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°17 de FEN_Plainte.LIB_Statut_de_l_accusé7
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378579070691629659l);

super.setChecksum("600000707");

super.setNom("LIB_Statut_de_l_accusé7");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Ville/Commune/Territoire du Plaignant :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(12, 454);

super.setTailleInitiale(300, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(17);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statut_de_l_accuse7 mWD_LIB_Statut_de_l_accuse7;

/**
 * LIB_Statut_de_l_accusé8
 */
class GWDLIB_Statut_de_l_accuse8 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°18 de FEN_Plainte.LIB_Statut_de_l_accusé8
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378579835199721540l);

super.setChecksum("603914078");

super.setNom("LIB_Statut_de_l_accusé8");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Adresse du Plaignant :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(12, 527);

super.setTailleInitiale(300, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(18);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 1), 3, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


super.setMiseABlancSiZero(true);

activerEcoute();
super.terminerInitialisation();
}

// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDLIB_Statut_de_l_accuse8 mWD_LIB_Statut_de_l_accuse8;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xFFFFFF, 0xF39621, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

/**
 * Traitement: Déclarations globales de FEN_Plainte
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// ListeAjoute(COMBO_Province,"Sélectionnez votre province")
WDAPIListe.listeAjoute(mWD_COMBO_Province,"Sélectionnez votre province");

// HLitPremier(t_province, LibelleVille)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("t_province"),WDAPIHF.getRubriqueSansCasseNiAccent("libelleville"));

// TANTQUE PAS HEnDehors()
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 	ListeAjoute(COMBO_Province, t_province.LibelleVille)
WDAPIListe.listeAjoute(mWD_COMBO_Province,WDAPIHF.getFichierSansCasseNiAccent("t_province").getRubriqueSansCasseNiAccent("libelleville").getString());

// 	HLitSuivant(t_province, LibelleVille)
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("t_province"),WDAPIHF.getRubriqueSansCasseNiAccent("libelleville"));

}

// ListeAjoute(COMBO_Commune,"Sélectionnez votre commune")
WDAPIListe.listeAjoute(mWD_COMBO_Commune,"Sélectionnez votre commune");

// HLitPremier(t_territoire, LibelleTerritoire)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("t_territoire"),WDAPIHF.getRubriqueSansCasseNiAccent("libelleterritoire"));

// TANTQUE PAS HEnDehors()
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 	ListeAjoute(COMBO_Commune, t_territoire.LibelleTerritoire)
WDAPIListe.listeAjoute(mWD_COMBO_Commune,WDAPIHF.getFichierSansCasseNiAccent("t_territoire").getRubriqueSansCasseNiAccent("libelleterritoire").getString());

// 	HLitSuivant(t_territoire, LibelleTerritoire)
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("t_territoire"),WDAPIHF.getRubriqueSansCasseNiAccent("libelleterritoire"));

}

// si gnTypedenonciation=0 ALORS
if(GWDPTono_CF.getInstance().vWD_gnTypedenonciation.opEgal(0))
{
// 	SEL_Genre..Valeur="Anonyme"
mWD_SEL_Genre.setProp(EWDPropriete.PROP_VALEUR,"Anonyme");

// 	SEL_Genre..Etat=AffichageSeulement
mWD_SEL_Genre.setProp(EWDPropriete.PROP_ETAT,1);

// 	SAI_Noms="ANONYME"
mWD_SAI_Noms.setValeur("ANONYME");

// 	SAI_Noms..Etat=AffichageSeulement
mWD_SAI_Noms.setProp(EWDPropriete.PROP_ETAT,1);

// 	SAI_Adresse="ANONYME"
mWD_SAI_Adresse.setValeur("ANONYME");

// 	SAI_Adresse..Etat=AffichageSeulement
mWD_SAI_Adresse.setProp(EWDPropriete.PROP_ETAT,1);

}
else
{
// 	SEL_Genre=-1
mWD_SEL_Genre.setValeur(-1);

// 	SEL_Genre..Etat=Actif
mWD_SEL_Genre.setProp(EWDPropriete.PROP_ETAT,0);

}

}




/**
 * Traitement: Fermeture d'une fenêtre fille de FEN_Plainte
 */
public void fermetureFenetreFille()
{
super.fermetureFenetreFille();

// Ferme()
// Ferme()
WDAPIFenetre.ferme();

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Plainte
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_SEL_Genre = new GWDSEL_Genre();
mWD_SAI_Noms = new GWDSAI_Noms();
mWD_IMG_Localisation2 = new GWDIMG_Localisation2();
mWD_SAI_Telephone = new GWDSAI_Telephone();
mWD_COMBO_Province = new GWDCOMBO_Province();
mWD_COMBO_Commune = new GWDCOMBO_Commune();
mWD_SAI_Adresse = new GWDSAI_Adresse();
mWD_BTN_Suivant = new GWDBTN_Suivant();
mWD_LIB_Informations_sur_le_plaignant = new GWDLIB_Informations_sur_le_plaignant();
mWD_SAI_Email = new GWDSAI_Email();
mWD_SAI_Indicatif = new GWDSAI_Indicatif();
mWD_LIB_Statut_de_l_accuse2 = new GWDLIB_Statut_de_l_accuse2();
mWD_LIB_Statut_de_l_accuse3 = new GWDLIB_Statut_de_l_accuse3();
mWD_LIB_Statut_de_l_accuse4 = new GWDLIB_Statut_de_l_accuse4();
mWD_LIB_Statut_de_l_accuse5 = new GWDLIB_Statut_de_l_accuse5();
mWD_LIB_Statut_de_l_accuse6 = new GWDLIB_Statut_de_l_accuse6();
mWD_LIB_Statut_de_l_accuse7 = new GWDLIB_Statut_de_l_accuse7();
mWD_LIB_Statut_de_l_accuse8 = new GWDLIB_Statut_de_l_accuse8();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Plainte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 671, 320, 568, 160, 0);
declarerAgencement(0, 568, 681, 320, 568, 160, 1);
declarerAgencement(0, 593, 694, 800, 1280, 216, 0);
declarerAgencement(0, 948, 691, 800, 1280, 216, 1);
super.setQuid(2376385012391599065l);

super.setChecksum("579845734");

super.setNom("FEN_Plainte");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

setAgencementEnEdition(0);
appliquerAgencement(getIndexAgencement());

super.setTitre("Plainte / Dénonciation 1/2");

super.setTailleMin(-1, -1);

super.setTailleMax(20000, 20000);

super.setVisibleInitial(true);

super.setPositionFenetre(1);

super.setPersistant(true);

super.setGFI(true);

super.setAnimationFenetre(0);

super.setImageFond("", 1, 0, 1);

super.setCouleurTexteAutomatique(0xF4000000);

super.setCouleurBarreSysteme(0xFF000001);


activerEcoute();

////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte
////////////////////////////////////////////////////////////////////////////
mWD_SEL_Genre.initialiserObjet();
super.ajouter("SEL_Genre", mWD_SEL_Genre);
mWD_SAI_Noms.initialiserObjet();
super.ajouter("SAI_Noms", mWD_SAI_Noms);
mWD_IMG_Localisation2.initialiserObjet();
super.ajouter("IMG_Localisation2", mWD_IMG_Localisation2);
mWD_SAI_Telephone.initialiserObjet();
super.ajouter("SAI_Telephone", mWD_SAI_Telephone);
mWD_COMBO_Province.initialiserObjet();
super.ajouter("COMBO_Province", mWD_COMBO_Province);
mWD_COMBO_Commune.initialiserObjet();
super.ajouter("COMBO_Commune", mWD_COMBO_Commune);
mWD_SAI_Adresse.initialiserObjet();
super.ajouter("SAI_Adresse", mWD_SAI_Adresse);
mWD_BTN_Suivant.initialiserObjet();
super.ajouter("BTN_Suivant", mWD_BTN_Suivant);
mWD_LIB_Informations_sur_le_plaignant.initialiserObjet();
super.ajouter("LIB_Informations_sur_le_plaignant", mWD_LIB_Informations_sur_le_plaignant);
mWD_SAI_Email.initialiserObjet();
super.ajouter("SAI_Email", mWD_SAI_Email);
mWD_SAI_Indicatif.initialiserObjet();
super.ajouter("SAI_Indicatif", mWD_SAI_Indicatif);
mWD_LIB_Statut_de_l_accuse2.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé2", mWD_LIB_Statut_de_l_accuse2);
mWD_LIB_Statut_de_l_accuse3.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé3", mWD_LIB_Statut_de_l_accuse3);
mWD_LIB_Statut_de_l_accuse4.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé4", mWD_LIB_Statut_de_l_accuse4);
mWD_LIB_Statut_de_l_accuse5.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé5", mWD_LIB_Statut_de_l_accuse5);
mWD_LIB_Statut_de_l_accuse6.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé6", mWD_LIB_Statut_de_l_accuse6);
mWD_LIB_Statut_de_l_accuse7.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé7", mWD_LIB_Statut_de_l_accuse7);
mWD_LIB_Statut_de_l_accuse8.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé8", mWD_LIB_Statut_de_l_accuse8);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_Plainte
////////////////////////////////////////////////////////////////////////////
public  void appliquerAgencement(int nIndiceAgencement)
{
super.appliquerAgencement(nIndiceAgencement);
switch(nIndiceAgencement){
case 0 :
super.setTailleInitiale(320, 671);

break;
case 1 :
super.setTailleInitiale(568, 681);

break;
case 2 :
super.setTailleInitiale(593, 694);

break;
case 3 :
super.setTailleInitiale(948, 691);

break;
}
}

////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}

public WDProjet getProjet()
{
return GWDPTono_CF.getInstance();
}

public IWDEnsembleElement getEnsemble()
{
return GWDPTono_CF.getInstance();
}
public int getModeContexteHF()
{
return 1;
}
/**
* Retourne le mode d'affichage de l'ActionBar de la fenêtre.
*/
public int getModeActionBar()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est maximisée, faux sinon.
*/
public boolean isMaximisee()
{
return true;
}
/**
* Retourne vrai si la fenêtre a une barre de titre, faux sinon.
*/
public boolean isAvecBarreDeTitre()
{
return true;
}
/**
* Retourne le mode d'affichage de la barre système de la fenêtre.
*/
public int getModeBarreSysteme()
{
return 1;
}
/**
* Retourne vrai si la fenêtre est munie d'ascenseurs automatique, faux sinon.
*/
public boolean isAvecAscenseurAuto()
{
return true;
}
/**
* Retourne Vrai si on doit appliquer un theme "dark" (sombre) ou Faux si on doit appliquer "light" (clair) à la fenêtre.
* Ce choix se base sur la couleur du libellé par défaut dans le gabarit de la fenêtre.
*/
public boolean isGabaritSombre()
{
return false;
}
public boolean isIgnoreModeNuit()
{
return false;
}
/**
* Retourne vrai si l'option de masquage automatique de l'ActionBar lorsqu'on scrolle dans un champ de la fenêtre a été activée.
*/
public boolean isMasquageAutomatiqueActionBar()
{
return false;
}
public static class WDActiviteFenetre extends WDActivite
{
protected WDFenetre getFenetre()
{
return GWDPTono_CF.getInstance().mWD_FEN_Plainte;
}
}
/**
* Retourne le nom du gabarit associée à la fenêtre.
*/
public String getNomGabarit()
{
return "210 MATERIAL DESIGN BLUE#WM";
}
}
