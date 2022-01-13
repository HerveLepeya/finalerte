/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Explorateur_Audio_MOBILE
 * Date : 24/10/2021 05:22:59
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.champ.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.core.types.collection.*;
import fr.pcsoft.wdjava.core.parcours.chaine.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Explorateur_Audio_MOBILE extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Explorateur_Audio_MOBILE
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_DossiersFichiers
 */
class GWDZR_DossiersFichiers extends WDZoneRepetee
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_CheminComplet
 */
class GWDATT_CheminComplet extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.ATT_CheminComplet
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_CheminComplet");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.ATT_CheminComplet

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_CheminComplet mWD_ATT_CheminComplet = new GWDATT_CheminComplet();

/**
 * ATT_Selection
 */
class GWDATT_Selection extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.ATT_Selection
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Selection");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.ATT_Selection

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Selection mWD_ATT_Selection = new GWDATT_Selection();

/**
 * ATT_Type
 */
class GWDATT_Type extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.ATT_Type
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_Type");

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.ATT_Type

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_Type mWD_ATT_Type = new GWDATT_Type();

/**
 * IMG_Logo
 */
class GWDIMG_Logo extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.IMG_Logo
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377488840530175054l);

super.setChecksum("641743887");

super.setNom("IMG_Logo");

super.setType(8);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(4, 2);

super.setTailleInitiale(42, 34);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\ANL10060@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setTransparence(1);

super.setParamImage(2097158, 0, true, 100);

super.setSymetrie(0);

super.setZoneClicage(false);

super.setPCodeMultitouch(false);

super.setChargementEnTacheDeFond(true);

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
public GWDIMG_Logo mWD_IMG_Logo = new GWDIMG_Logo();

/**
 * INT_Selected
 */
class GWDINT_Selected extends WDInterrupteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.INT_Selected
////////////////////////////////////////////////////////////////////////////

/**
 * INT_Selected_Option_0
 */
class GWDINT_Selected_Option_0 extends WDCaseACocher
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.INT_Selected.INT_Selected_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("");

super.setHauteurOption(0);

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_Selected_Option_0 mWD_INT_Selected_Option_0 = new GWDINT_Selected_Option_0();
/**
 * Initialise tous les champs de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.INT_Selected
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.INT_Selected
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_INT_Selected_Option_0);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,37,32);
super.setQuid(2377488840530240590l);

super.setChecksum("641808055");

super.setNom("INT_Selected");

super.setType(5);

super.setBulle("");

super.setLibelle("&Interrupteur");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(525, 2);

super.setTailleInitiale(37, 32);

super.setValeurInitiale("0");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 1, true, true, false);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x212121, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));


super.setImageCoche("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_CBox@dpi160.png?E12_8O", 1);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de INT_Selected ( ZR_DossiersFichiers )
 */
public void modification()
{
super.modification();

// 
// SI INT_Selected..Valeur=0 ALORS
if(this.getProp(EWDPropriete.PROP_VALEUR).opEgal(0))
{
// 	ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection	= Faux
mWD_ZR_DossiersFichiers.get(mWD_ZR_DossiersFichiers).get("ATT_Selection").setValeur(false);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDINT_Selected mWD_INT_Selected = new GWDINT_Selected();

/**
 * LIB_Nom
 */
class GWDLIB_Nom extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.LIB_Nom
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377489909980360965l);

super.setChecksum("645071063");

super.setNom("LIB_Nom");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("1");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(54, 6);

super.setTailleInitiale(222, 51);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(32768);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xB8B2AC, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0xFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0x816536, 0x10000, 0xFFFFFFFF, 2.000000, 2.000000, 0, 1), 0, 0, 0, 0);


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
public GWDLIB_Nom mWD_LIB_Nom = new GWDLIB_Nom();

/**
 * IMG_PlaySon
 */
class GWDIMG_PlaySon extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers.IMG_PlaySon
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377539877645187255l);

super.setChecksum("660389603");

super.setNom("IMG_PlaySon");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(6, 42);

super.setTailleInitiale(40, 32);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\FLS01322@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(4);

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

/**
 * Traitement: Clic sur IMG_PlaySon ( ZR_DossiersFichiers )
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// Indice = ZoneRépétéeSelectOccurrence(ZR_DossiersFichiers)

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sValson = new WDChaineU();



// Indice = ZoneRépétéeSelectOccurrence(ZR_DossiersFichiers)
vWD_Indice.setValeur(WDAPIZoneRepetee.zoneRepeteeSelectOccurrence(mWD_ZR_DossiersFichiers));

// sValson est une chaine=ZR_DossiersFichiers[Indice].ATT_CheminComplet

vWD_sValson.setValeur(mWD_ZR_DossiersFichiers.get(vWD_Indice).get("ATT_CheminComplet"));


// Son(sValson,sonBoucle)
WDAPIMedia.son(vWD_sValson.getString(),8);

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
public GWDIMG_PlaySon mWD_IMG_PlaySon = new GWDIMG_PlaySon();
/**
 * Initialise tous les champs de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Explorateur_Audio_MOBILE.ZR_DossiersFichiers
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_CheminComplet.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_CheminComplet);
mWD_ATT_Selection.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Selection);
mWD_ATT_Type.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_Type);
mWD_IMG_Logo.initialiserObjet();
super.ajouterChamp("IMG_Logo",mWD_IMG_Logo);
mWD_INT_Selected.initialiserObjet();
super.ajouterChamp("INT_Selected",mWD_INT_Selected);
mWD_LIB_Nom.initialiserObjet();
super.ajouterChamp("LIB_Nom",mWD_LIB_Nom);
mWD_IMG_PlaySon.initialiserObjet();
super.ajouterChamp("IMG_PlaySon",mWD_IMG_PlaySon);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,565,79);
super.setQuid(2377488840529912910l);

super.setChecksum("641491775");

super.setNom("ZR_DossiersFichiers");

super.setType(30);

super.setBulle("");

super.setLibelle("Zone répétée");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(3, 0);

super.setTailleInitiale(565, 247);

super.setValeurInitiale("");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

super.setModeAscenseur(1, 1);

super.setModeSelection(99);

super.setSaisieEnCascade(false);

super.setLettreAppel(65535);

super.setEnregistrementSortieLigne(true);

super.setPersistant(false);

super.setParamAffichage(0, 0, 1, 565, 79);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x212121, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(false, 0xFFFFFFFF);

super.setStyleSeparateurHorizontaux(0, 0xFFFFFFFF);

super.setDessinerLigneVide(false);

super.setCouleurCellule(0xFFFFFFFF, 0xFFFFFFFF, 0x212121, 0xF5A542, 0xFFFFFF);

super.setImagePlusMoins("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Break_Pict@dpi160.png?E2_4O");

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de ZR_DossiersFichiers
 */
public void selectionLigne()
{
super.selectionLigne();

// si AttSeclect=1 ALORS
// si AttSeclect=1 ALORS
if(vWD_AttSeclect.opEgal(1))
{
// 	ZR_DossiersFichiers[ZR_DossiersFichiers].INT_Selected..Valeur=1
this.get(this).get("INT_Selected").setProp(EWDPropriete.PROP_VALEUR,1);

// 	ZR_DossiersFichiers[ZR_DossiersFichiers].INT_Selected..Visible									= Vrai
this.get(this).get("INT_Selected").setProp(EWDPropriete.PROP_VISIBLE,true);

// 	ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection	= Vrai
this.get(this).get("ATT_Selection").setValeur(true);

}

}




/**
 * Traitement: A chaque modification de ZR_DossiersFichiers
 */
public void modification()
{
super.modification();

// si ZR_DossiersFichiers[ZR_DossiersFichiers].INT_Selected..Valeur=0 ALORS
// si ZR_DossiersFichiers[ZR_DossiersFichiers].INT_Selected..Valeur=0 ALORS
if(this.get(this).get("INT_Selected").getProp(EWDPropriete.PROP_VALEUR).opEgal(0))
{
// 	INT_Selected..Visible=faux
mWD_INT_Selected.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection =faux
this.get(this).get("ATT_Selection").setValeur(false);

}
else
{
// 	ZR_DossiersFichiers[ZR_DossiersFichiers].INT_Selected..Visible=Vrai
this.get(this).get("INT_Selected").setProp(EWDPropriete.PROP_VISIBLE,true);

// 	ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection =Vrai
this.get(this).get("ATT_Selection").setValeur(true);

}

}




/**
 * Traitement: Appui long / Affichage menu contextuel de ZR_DossiersFichiers
 */
public WDObjet trtAffichageMenuContextuel()
{
super.trtAffichageMenuContextuel();

// SI ZR_DossiersFichiers = -1 ALORS
// SI ZR_DossiersFichiers = -1 ALORS
if(this.opEgal(-1))
{
// 	RETOUR
return new WDVoid("fWD_appui_long_Affichage_menu_contextuel_de_ZR_DossiersFichiers");

}

// AttSeclect=1
vWD_AttSeclect.setValeur(1);

// ZR_DossiersFichiers[ZR_DossiersFichiers].INT_Selected..Valeur=1
this.get(this).get("INT_Selected").setProp(EWDPropriete.PROP_VALEUR,1);

// ZR_DossiersFichiers[ZR_DossiersFichiers].INT_Selected..Visible=Vrai
this.get(this).get("INT_Selected").setProp(EWDPropriete.PROP_VISIBLE,true);

// ZR_DossiersFichiers[ZR_DossiersFichiers].ATT_Selection =Vrai
this.get(this).get("ATT_Selection").setValeur(true);

return new WDVoid("fWD_appui_long_Affichage_menu_contextuel_de_ZR_DossiersFichiers");
}




// Activation des écouteurs: 
public void activerEcoute()
{
super.activerEcouteurSelection();
super.activerEcouteurAffichageMenuContextuel();
super.activerEcouteurModification();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZR_DossiersFichiers mWD_ZR_DossiersFichiers;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Explorateur_Audio_MOBILE.ACTB_ActionBar
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setNom("ACTB_ActionBar");

super.setNote("", "");

super.setParamBoutonGauche(true, 1, "", "");

super.setParamBoutonDroit(false, 0, "", "");

super.setStyleActionBar(0xF1000000, 0xF39621, true);

super.setImageFond("");

super.setStyleBarreNavigation(0xFF000001, 0x808080);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDACTB_ActionBar mWD_ACTB_ActionBar;

class GWDM_Menu extends WDMenuPrincipal
{

class GWDMOPT_Option extends WDOptionMenu
{
public GWDMOPT_Option(boolean b)
{
super(b, true);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setConteneurMenu(GWDM_Menu.this);
super.setQuid(2378603350307973757l);

super.setNom("OPT_Option");

super.setType(40001);

super.setLibelle("Option");

super.setEtat(0);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\ANL13210@dpi1x.png");

super.setVisible(true);

super.setCochee(false);

super.setNumero(1);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
}

public void selectionOptionMenu()
{
super.selectionOptionMenu();
// POUR TOUTE LIGNE nIndice DE ZR_DossiersFichiers
// POUR TOUTE LIGNE nIndice DE ZR_DossiersFichiers
IWDParcours parcours1 = null;
try
{
WDObjet vWD_nIndice = new WDEntier4();
parcours1 = WDParcoursChamp.pourTout(mWD_ZR_DossiersFichiers, vWD_nIndice, 0x2);
while(parcours1.testParcours())
{
// 	SI ZR_DossiersFichiers[nIndice].ATT_Selection=vrai ALORS
if(mWD_ZR_DossiersFichiers.get(parcours1.getVariableParcours()).get("ATT_Selection").opEgal(true))
{
// 		HLitRecherchePremier(t_fileplainte,FileName,ZR_DossiersFichiers[nIndice].ATT_CheminComplet)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("filename"),mWD_ZR_DossiersFichiers.get(parcours1.getVariableParcours()).get("ATT_CheminComplet"));

// 		SI PAS HTrouve(t_fileplainte) ALORS
if((!WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte")).getBoolean()))
{
// 			t_fileplainte.TypeContenu	= "Audio"
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").setValeur("Audio");

// 			t_fileplainte.FileName		= ZR_DossiersFichiers[nIndice].ATT_CheminComplet
WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("filename").setValeur(mWD_ZR_DossiersFichiers.get(parcours1.getVariableParcours()).get("ATT_CheminComplet"));

// 			HAjoute(t_fileplainte)
WDAPIHF.hAjoute(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"));

}

}

}

}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// Ferme()
WDAPIFenetre.ferme();

}




public void activerEcoute()
{
activerEcouteurSelectionMenu();
}
}
public GWDMOPT_Option mWD_OPT_Option = new GWDMOPT_Option(true);

public void initialiserSousObjets()
{
mWD_OPT_Option.initialiserObjet();
super.ajouterMenu(mWD_OPT_Option);
}
public void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377488840530371662l);

super.setNom("_Menu");

super.setType(40001);

super.setStyleOptionRepos(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

super.setStyleOptionSurvol(0xF7000000, 0xFF000001, creerPolice_GEN("Tahoma", -11.000000, 0));

activerEcoute();
initialiserSousObjets();
}
}
public GWDM_Menu mWD__Menu;



/**
 * Traitement: Déclarations globales de FEN_Explorateur_Audio_MOBILE
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// AttSeclect est un entier
vWD_AttSeclect = new WDEntier4();

super.ajouterVariableGlobale("AttSeclect",vWD_AttSeclect);



// bufRésultat		est un buffer
vWD_bufResultat = new WDBuffer();

super.ajouterVariableGlobale("bufRésultat",vWD_bufResultat);



// sUrldataplainte	est une chaîne	= gsUrlapi+"requestplaintes/Saveplainte"
vWD_sUrldataplainte = new WDChaineU();

vWD_sUrldataplainte.setValeur(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/Saveplainte"));

super.ajouterVariableGlobale("sUrldataplainte",vWD_sUrldataplainte);



// UnFichier, ResListeFichier , Extention	sont des chaînes
vWD_UnFichier = new WDChaineU();

super.ajouterVariableGlobale("UnFichier",vWD_UnFichier);


vWD_ResListeFichier = new WDChaineU();

super.ajouterVariableGlobale("ResListeFichier",vWD_ResListeFichier);


vWD_Extention = new WDChaineU();

super.ajouterVariableGlobale("Extention",vWD_Extention);



// tabChaine	est un tableau de chaînes	= [".mp3",".wma"]
vWD_tabChaine = new WDTableauSimple(1, new int[]{0}, 0, 16);
vWD_tabChaine.setValeur(new WDSerie(new WDObjet[]{new WDChaineU(".mp3"), new WDChaineU(".wma")}));

super.ajouterVariableGlobale("tabChaine",vWD_tabChaine);



// Indice		est un entier				= 0
vWD_Indice = new WDEntier4();

vWD_Indice.setValeur(0);

super.ajouterVariableGlobale("Indice",vWD_Indice);



// ResListeFichier = fListeFichier("/storage/emulated/0/Music/*.*", frRécursif + frInterruptible)
vWD_ResListeFichier.setValeur(WDAPIFichier.fListeFichier("/storage/emulated/0/Music/*.*",new WDEntier4(5)));

// ZoneRépétéeSupprimeTout(ZR_DossiersFichiers)
WDAPIZoneRepetee.zoneRepeteeSupprimeTout(mWD_ZR_DossiersFichiers);

// POUR TOUTE CHAÎNE UnFichier DE ResListeFichier SEPAREE PAR RC
IWDParcours parcours2 = null;
try
{
parcours2 = WDParcoursSousChaine.pourTout(vWD_UnFichier, null, null, vWD_ResListeFichier, "\r\n", 0x2);
while(parcours2.testParcours())
{
// 	Extention=(fExtraitChemin(UnFichier,fExtension))
vWD_Extention.setValeur(WDAPIFichier.fExtraitChemin(parcours2.getVariableParcours().getString(),8));

// 	SI Contient(Extention, tabChaine)
if(WDAPIChaine.contient(vWD_Extention,vWD_tabChaine).getBoolean())
{
// 		ZoneRépétéeAjoute(ZR_DossiersFichiers)
WDAPIZoneRepetee.zoneRepeteeAjoute(mWD_ZR_DossiersFichiers);

// 		Indice = ZoneRépétéeOccurrence(ZR_DossiersFichiers)
vWD_Indice.setValeur(WDAPIZoneRepetee.zoneRepeteeOccurrence(mWD_ZR_DossiersFichiers));

// 		ZR_DossiersFichiers[Indice].LIB_Nom=UnFichier
mWD_ZR_DossiersFichiers.get(vWD_Indice).get("LIB_Nom").setValeur(parcours2.getVariableParcours());

// 		ZR_DossiersFichiers[Indice].ATT_CheminComplet=UnFichier
mWD_ZR_DossiersFichiers.get(vWD_Indice).get("ATT_CheminComplet").setValeur(parcours2.getVariableParcours());

}

}

}
finally
{
if(parcours2 != null)
{
parcours2.finParcours();
}
}


// ZoneRépétéeAffiche(ZR_DossiersFichiers)
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_DossiersFichiers);

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_AttSeclect = WDVarNonAllouee.ref;
 public WDObjet vWD_bufResultat = WDVarNonAllouee.ref;
 public WDObjet vWD_sUrldataplainte = WDVarNonAllouee.ref;
 public WDObjet vWD_UnFichier = WDVarNonAllouee.ref;
 public WDObjet vWD_ResListeFichier = WDVarNonAllouee.ref;
 public WDObjet vWD_Extention = WDVarNonAllouee.ref;
 public WDObjet vWD_tabChaine = WDVarNonAllouee.ref;
 public WDObjet vWD_Indice = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Explorateur_Audio_MOBILE
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_DossiersFichiers = new GWDZR_DossiersFichiers();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD__Menu = new GWDM_Menu();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Explorateur_Audio_MOBILE
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 495, 320, 568, 160, 0);
declarerAgencement(0, 568, 247, 320, 568, 160, 1);
declarerAgencement(0, 593, 811, 800, 1280, 216, 0);
declarerAgencement(0, 948, 456, 800, 1280, 216, 1);
super.setQuid(2377488840529716302l);

super.setChecksum("644319496");

super.setNom("FEN_Explorateur_Audio_MOBILE");

super.setType(1);

super.setBulle("");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setCouleur(0x0);

super.setCouleurFond(0xFFFFFF);

super.setPositionInitiale(0, 0);

setAgencementEnEdition(1);
appliquerAgencement(getIndexAgencement());

super.setTitre("Explorateur Audios");

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
// Initialisation des champs de FEN_Explorateur_Audio_MOBILE
////////////////////////////////////////////////////////////////////////////
mWD_ZR_DossiersFichiers.initialiserObjet();
super.ajouter("ZR_DossiersFichiers", mWD_ZR_DossiersFichiers);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_Explorateur_Audio_MOBILE
////////////////////////////////////////////////////////////////////////////
public  void appliquerAgencement(int nIndiceAgencement)
{
super.appliquerAgencement(nIndiceAgencement);
switch(nIndiceAgencement){
case 0 :
super.setTailleInitiale(320, 495);

break;
case 1 :
super.setTailleInitiale(568, 247);

break;
case 2 :
super.setTailleInitiale(593, 811);

break;
case 3 :
super.setTailleInitiale(948, 456);

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
return GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Audio_MOBILE;
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
