/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Nos_annonces
 * Date : 24/10/2021 05:22:59
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.zr.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Nos_annonces extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Nos_annonces
////////////////////////////////////////////////////////////////////////////

/**
 * ZR_t_annonces
 */
class GWDZR_t_annonces extends WDZoneRepeteeFichierEnMemoire
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Nos_annonces.ZR_t_annonces
////////////////////////////////////////////////////////////////////////////

/**
 * ATT_AttLibellé
 */
class GWDATT_AttLibelle extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Nos_annonces.ZR_t_annonces.ATT_AttLibellé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_AttLibellé");

super.setLiaisonFichier("t_annonces", "titreannonce");

super.setChampAssocie(mWD_LIB_Libelle1);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Nos_annonces.ZR_t_annonces.ATT_AttLibellé

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_AttLibelle mWD_ATT_AttLibelle = new GWDATT_AttLibelle();

/**
 * ATT_AttSousLibellé
 */
class GWDATT_AttSousLibelle extends WDAttributZR
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Nos_annonces.ZR_t_annonces.ATT_AttSousLibellé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setNom("ATT_AttSousLibellé");

super.setLiaisonFichier("t_annonces", "contenuannonce");

super.setChampAssocie(mWD_LIB_SousLibelle1);

super.setProprieteAssocie(EWDPropriete.PROP_VALEUR);

activerEcoute();
super.terminerInitialisation();
}
// Pas de traitement pour le champ FEN_Nos_annonces.ZR_t_annonces.ATT_AttSousLibellé

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDATT_AttSousLibelle mWD_ATT_AttSousLibelle = new GWDATT_AttSousLibelle();

/**
 * LIB_Libellé1
 */
class GWDLIB_Libelle1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Nos_annonces.ZR_t_annonces.LIB_Libellé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2386806565922328256l);

super.setChecksum("645822469");

super.setNom("LIB_Libellé1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("FinAlerte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(3, 39);

super.setTailleInitiale(310, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setLiaisonFichier("t_annonces", "titreannonce");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(32768);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Arial", -8.000000, 1), 3, 0, 0x222222);

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
public GWDLIB_Libelle1 mWD_LIB_Libelle1 = new GWDLIB_Libelle1();

/**
 * LIB_SousLibellé1
 */
class GWDLIB_SousLibelle1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Nos_annonces.ZR_t_annonces.LIB_SousLibellé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2386806565922393792l);

super.setChecksum("645888005");

super.setNom("LIB_SousLibellé1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("FinAlerte : Est un outil du Ministère des Finances RDC permettant aux personnes lésées par les entités sous la tutelle de ce dernier, de part les services leurs rendus, à pouvoir loger leurs plaintes.                                                       \r\n                                                    ");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(3, 60);

super.setTailleInitiale(310, 51);

super.setPlan(0);

super.setCadrageHorizontal(3);

super.setCadrageVertical(1);

super.setLiaisonFichier("t_annonces", "contenuannonce");

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(10, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x8E8E8F, 0xFFFFFFFF, creerPolice_GEN("Arial", -7.000000, 0), 3, 0, 0x222222);

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
public GWDLIB_SousLibelle1 mWD_LIB_SousLibelle1 = new GWDLIB_SousLibelle1();

/**
 * IMG_SansNom51
 */
class GWDIMG_SansNom51 extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Nos_annonces.ZR_t_annonces.IMG_SansNom51
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2386811234643567239l);

super.setChecksum("737614067");

super.setNom("IMG_SansNom51");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(6, 0);

super.setTailleInitiale(36, 36);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\IMG-Nouveau-Email.svg");

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

super.setParamAnimation(1, 7, false, 150, true, true);

super.setAnimationInitiale(true);

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
public GWDIMG_SansNom51 mWD_IMG_SansNom51 = new GWDIMG_SansNom51();

/**
 * LIB_AnnonceId
 */
class GWDLIB_AnnonceId extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Nos_annonces.ZR_t_annonces.LIB_AnnonceId
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2386816977035119129l);

super.setChecksum("757890262");

super.setNom("LIB_AnnonceId");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("1");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(260, 8);

super.setTailleInitiale(50, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setLiaisonFichier("t_annonces", "annonceid");

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(false);

super.setAltitude(4);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -8.000000, 0), 3, 0, 0x222222);

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
public GWDLIB_AnnonceId mWD_LIB_AnnonceId = new GWDLIB_AnnonceId();
/**
 * Initialise tous les champs de FEN_Nos_annonces.ZR_t_annonces
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Nos_annonces.ZR_t_annonces
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ATT_AttLibelle.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_AttLibelle);
mWD_ATT_AttSousLibelle.initialiserObjet();
super.ajouterAttributZR(mWD_ATT_AttSousLibelle);
mWD_LIB_Libelle1.initialiserObjet();
super.ajouterChamp("LIB_Libellé1",mWD_LIB_Libelle1);
mWD_LIB_SousLibelle1.initialiserObjet();
super.ajouterChamp("LIB_SousLibellé1",mWD_LIB_SousLibelle1);
mWD_IMG_SansNom51.initialiserObjet();
super.ajouterChamp("IMG_SansNom51",mWD_IMG_SansNom51);
mWD_LIB_AnnonceId.initialiserObjet();
super.ajouterChamp("LIB_AnnonceId",mWD_LIB_AnnonceId);
creerAttributAuto();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,1,318,119);
super.setQuid(2386806565922131648l);

super.setChecksum("645638173");

super.setNom("ZR_t_annonces");

super.setType(30);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(0, 0);

super.setTailleInitiale(320, 495);

super.setValeurInitiale("");

super.setPlan(0);

super.setSourceRemplissage("t_annonces", "titreannonce", "annonceid", true, "", false);

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

super.setParamAffichage(0, 0, 1, 318, 119);

super.setBtnEnrouleDeroule(true);

super.setScrollRapide(false, null);

super.setDeplacementParDnd(0);

super.setSwipe(0, "", false, false, "", false, false);

super.setRecyclageChamp(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(2, 0xE1E1E1, 0x616161, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setStyleSeparateurVerticaux(true, 0xE1E1E1);

super.setStyleSeparateurHorizontaux(3, 0xE1E1E1);

super.setDessinerLigneVide(false);

super.setCouleurCellule(0xFFFFFF, 0xFFFFFF, 0x222222, 0xE2E2E2, 0xFFFFFF);

super.setCadreFondLigne(WDCadreFactory.creerCadre_GEN("", new int[] {1,4,1,2,2,2,1,4,1}, new int[] {4, 4, 4, 4}, 0xFFFFFFFF, 0, 5));

super.setImagePlusMoins("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Break_Pict@dpi160.png?E2_4O");

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection d'une ligne de ZR_t_annonces
 */
public void selectionLigne()
{
super.selectionLigne();

// info(ATT_AttSousLibellé)
// info(ATT_AttSousLibellé)
WDAPIDialogue.info(mWD_ATT_AttSousLibelle.getString());

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
public GWDZR_t_annonces mWD_ZR_t_annonces;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Nos_annonces.ACTB_ActionBar
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
 * Traitement: Déclarations globales de FEN_Nos_annonces
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCEDURE FEN_Nos_annonces()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


}




/**
 * Traitement: Fermeture d'une fenêtre fille de FEN_Nos_annonces
 */
public void fermetureFenetreFille()
{
super.fermetureFenetreFille();

// ZoneRépétéeAffiche(ZR_t_annonces,taCourantBandeau)
// ZoneRépétéeAffiche(ZR_t_annonces,taCourantBandeau)
WDAPIZoneRepetee.zoneRepeteeAffiche(mWD_ZR_t_annonces,new WDChaineU("P"));

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Nos_annonces
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_ZR_t_annonces = new GWDZR_t_annonces();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Nos_annonces
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 495, 320, 568, 160, 0);
declarerAgencement(0, 568, 247, 320, 568, 160, 1);
declarerAgencement(0, 593, 811, 800, 1280, 216, 0);
declarerAgencement(0, 948, 456, 800, 1280, 216, 1);
super.setQuid(2386806540145637185l);

super.setChecksum("644203809");

super.setNom("FEN_Nos_annonces");

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

super.setTitre("Nos annonces");

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
// Initialisation des champs de FEN_Nos_annonces
////////////////////////////////////////////////////////////////////////////
mWD_ZR_t_annonces.initialiserObjet();
super.ajouter("ZR_t_annonces", mWD_ZR_t_annonces);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_Nos_annonces
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
return false;
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
return GWDPTono_CF.getInstance().mWD_FEN_Nos_annonces;
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
