/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Fenêtre
 * Classe Android : FEN_Plainte_MOBILE
 * Date : 24/10/2021 05:22:59
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.ui.champs.fenetre.*;
import fr.pcsoft.wdjava.ui.champs.*;
import fr.pcsoft.wdjava.ui.champs.saisie.*;
import fr.pcsoft.wdjava.ui.cadre.*;
import fr.pcsoft.wdjava.ui.champs.combo.*;
import fr.pcsoft.wdjava.api.*;
import fr.pcsoft.wdjava.ui.champs.bouton.*;
import fr.pcsoft.wdjava.net.http.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.parcours.*;
import fr.pcsoft.wdjava.core.parcours.hf.*;
import fr.pcsoft.wdjava.ui.champs.libelle.*;
import fr.pcsoft.wdjava.core.context.*;
import fr.pcsoft.wdjava.ui.champs.groupeoptions.*;
import fr.pcsoft.wdjava.ui.champs.zml.*;
import fr.pcsoft.wdjava.ui.champs.image.*;
import fr.pcsoft.wdjava.ui.actionbar.*;
import fr.pcsoft.wdjava.ui.menu.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.ui.activite.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/



public class GWDFFEN_Plainte_MOBILE extends WDFenetre
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des groupes de champs de FEN_Plainte_MOBILE
////////////////////////////////////////////////////////////////////////////
 public WDGroupe mWD_GR_Groupe1;

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs de FEN_Plainte_MOBILE
////////////////////////////////////////////////////////////////////////////

/**
 * SAI_Accuse
 */
class GWDSAI_Accuse extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.SAI_Accuse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,301,36);
super.setQuid(2376669919812193240l);

super.setChecksum("1337896987");

super.setNom("SAI_Accuse");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(9, 444);

super.setTailleInitiale(302, 40);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("2"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("< Noms de l'accusé >");

super.setNumTab(6);

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
public GWDSAI_Accuse mWD_SAI_Accuse;

/**
 * COMBO_Entite
 */
class GWDCOMBO_Entite extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plainte_MOBILE.COMBO_Entite
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,302,40);
super.setQuid(2376669919812324312l);

super.setChecksum("1340369542");

super.setNom("COMBO_Entite");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(11, 73);

super.setTailleInitiale(302, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(1);

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
 * Traitement: Sélection d'une ligne de COMBO_Entite
 */
public void selectionLigne()
{
super.selectionLigne();

// HLitRecherchePremier(t_entite_accuse,NomEntite,COMBO_Entite..ValeurAffichée)
// HLitRecherchePremier(t_entite_accuse,NomEntite,COMBO_Entite..ValeurAffichée)
WDAPIHF.hLitRecherchePremier(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse"),WDAPIHF.getRubriqueSansCasseNiAccent("nomentite"),this.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// SI HTrouve(t_entite_accuse) ALORS
if(WDAPIHF.hTrouve(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse")).getBoolean())
{
// 	HExécuteRequête(REQ_TypePlainteByEntite,hRequêteDéfaut,t_entite_accuse.EntiteId)
WDAPIHF.hExecuteRequete(WDAPIHF.getRequeteSansCasseNiAccent("req_typeplaintebyentite"),new WDEntier4(0),new WDObjet[] {WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse").getRubriqueSansCasseNiAccent("entiteid")} );

// 	ListeSupprimeTout(COMBO_TypePlainte)
WDAPIListe.listeSupprimeTout(mWD_COMBO_TypePlainte);

// 	ListeAjoute(COMBO_TypePlainte,"Sélectionnez le type plainte")
WDAPIListe.listeAjoute(mWD_COMBO_TypePlainte,"Sélectionnez le type plainte");

// 	HLitPremier(REQ_TypePlainteByEntite, REQ_TypePlainteByEntite.LibelleTypePlainte)
WDAPIHF.hLitPremier(WDAPIHF.getRequeteSansCasseNiAccent("req_typeplaintebyentite"),WDAPIHF.getFichierSansCasseNiAccent("req_typeplaintebyentite").getRubriqueSansCasseNiAccent("libelletypeplainte"));

// 	TANTQUE PAS HEnDehors()
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 		ListeAjoute(COMBO_TypePlainte, REQ_TypePlainteByEntite.LibelleTypePlainte)
WDAPIListe.listeAjoute(mWD_COMBO_TypePlainte,WDAPIHF.getFichierSansCasseNiAccent("req_typeplaintebyentite").getRubriqueSansCasseNiAccent("libelletypeplainte").getString());

// 		HLitSuivant(REQ_TypePlainteByEntite, REQ_TypePlainteByEntite.LibelleTypePlainte)
WDAPIHF.hLitSuivant(WDAPIHF.getRequeteSansCasseNiAccent("req_typeplaintebyentite"),WDAPIHF.getFichierSansCasseNiAccent("req_typeplaintebyentite").getRubriqueSansCasseNiAccent("libelletypeplainte"));

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
public GWDCOMBO_Entite mWD_COMBO_Entite;

/**
 * BTN_Terminer
 */
class GWDBTN_Terminer extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°3 de FEN_Plainte_MOBILE.BTN_Terminer
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376669919812586456l);

super.setChecksum("1338291115");

super.setNom("BTN_Terminer");

super.setType(4);

super.setBulle("");

super.setLibelle("Terminer");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(18, 656);

super.setTailleInitiale(282, 51);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(5);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(3);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(11);

super.setLettreAppel(65535);

super.setTypeBouton(0);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(0, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(true);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\IOA01611a@dpi1x.png?E5", 0, 1, 5, null, null, null);

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
 * Traitement: Clic sur BTN_Terminer
 */
public void clicSurBoutonGauche()
// ChargeDLL("MaDll.dll")
{
super.clicSurBoutonGauche();

// //ChargeDLL("MaDll.dll")

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables locales au traitement
// (En WLangage les variables sont encore visibles après la fin du bloc dans lequel elles sont déclarées)
////////////////////////////////////////////////////////////////////////////
WDObjet vWD_sTypePreveu = new WDChaineU();



// sTypePreveu est une chaîne=""

vWD_sTypePreveu.setValeur("");


// SI SEL_TypePreuve..Valeur=0 ALORS
if(mWD_SEL_TypePreuve.getProp(EWDPropriete.PROP_VALEUR).opEgal(0))
{
// 	sTypePreveu="Sans Preuve"
vWD_sTypePreveu.setValeur("Sans Preuve");

}
else
{
// 	sTypePreveu="Avec Preuve"
vWD_sTypePreveu.setValeur("Avec Preuve");

}

// SI SAI_Accuse="" ALORS
if(mWD_SAI_Accuse.opEgal(""))
{
// 	Erreur("Vous devez saisir le nom de l'accusé avant de continuer!")
WDAPIDialogue.erreur("Vous devez saisir le nom de l'accusé avant de continuer!");

// 	DonneFocus(SAI_Accuse)
WDAPIDivers.donneFocus(mWD_SAI_Accuse);

}

// SI SAI_ServiceAccuse="" ALORS
if(mWD_SAI_ServiceAccuse.opEgal(""))
{
// 	Erreur("Vous devez saisir le nom de l'accusé avant de continuer!")
WDAPIDialogue.erreur("Vous devez saisir le nom de l'accusé avant de continuer!");

// 	DonneFocus(SAI_ServiceAccuse)
WDAPIDivers.donneFocus(mWD_SAI_ServiceAccuse);

}

// si SAI_Accuse<>"" et SAI_ServiceAccuse<>"" ALORS
if((mWD_SAI_Accuse.opDiff("") & mWD_SAI_ServiceAccuse.opDiff("")))
{
// 	TitreSuivant("Veuillez patienter SVP ...")
WDAPIFenetre.titreSuivant("Veuillez patienter SVP ...");

// 	Sablier(Vrai)
WDAPIDivers.sablier(new WDBooleen(true).getInt());

// 	pos = GPSDernièrePosition()
GWDPTono_CF.getInstance().vWD_pos.setValeur(WDAPIGPS.gpsDernierePosition());

// 	UnePlainte.CoordonneeGPS_Altitude	= pos.Altitude//"pos.Altitude"
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_CoordonneeGPS_Altitude.setValeur(GWDPTono_CF.getInstance().vWD_pos.getProp(EWDPropriete.PROP_ALTITUDE));

// 	UnePlainte.CoordonneeGPS_Latitude	= pos.Latitude//"pos.Latitude"
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_CoordonneeGPS_Latitude.setValeur(GWDPTono_CF.getInstance().vWD_pos.getProp(EWDPropriete.PROP_LATITUDE));

// 	UnePlainte.CoordonneeGPS_Longitude	= pos.Longitude//"pos.Longitude"
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_CoordonneeGPS_Longitude.setValeur(GWDPTono_CF.getInstance().vWD_pos.getProp(EWDPropriete.PROP_LONGITUDE));

// 	UnePlainte.CoordonneeGPS_Precision	= pos.Précision//"pos.Précision"
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_CoordonneeGPS_Precision.setValeur(GWDPTono_CF.getInstance().vWD_pos.getProp(EWDPropriete.PROP_PRECISION));

// 	SI gnCheckEntite=0 ALORS
if(GWDPTono_CF.getInstance().vWD_gnCheckEntite.opEgal(0))
{
// 		UnePlainte.MotifPlainte=COMBO_TypePlainte..ValeurAffichée
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_MotifPlainte.setValeur(mWD_COMBO_TypePlainte.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

}

// 	UnePlainte.NomAccuse			= SAI_Accuse
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_NomAccuse.setValeur(mWD_SAI_Accuse);

// 	UnePlainte.EntiteAccuse			= COMBO_Entite..ValeurAffichée
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_EntiteAccuse.setValeur(mWD_COMBO_Entite.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	UnePlainte.ProvinceAccuse		= COMBO_Province..ValeurAffichée
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_ProvinceAccuse.setValeur(mWD_COMBO_Province.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	UnePlainte.LocalisationAccuse	= COMBO_Commune..ValeurAffichée
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_LocalisationAccuse.setValeur(mWD_COMBO_Commune.getProp(EWDPropriete.PROP_VALEURAFFICHEE));

// 	UnePlainte.ServiceAccuse		= SAI_ServiceAccuse
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_ServiceAccuse.setValeur(mWD_SAI_ServiceAccuse);

// 	UnePlainte.TypeContenu			= sTypePreveu
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_TypeContenu.setValeur(vWD_sTypePreveu);

// 	UnePlainte.PhoneId				= "Phone"//
GWDPTono_CF.getInstance().vWD_UnePlainte.checkType(GWDCRapportPlainte.class).mWD_PhoneId.setValeur("Phone");

// 	Sérialise(UnePlainte,bufRésultat,psdJSON)
WDAPISerialise.serialise(GWDPTono_CF.getInstance().vWD_UnePlainte,vWD_bufResultat,1024);

// 	Multitâche(-1)
WDAPIVM.multitache(new WDEntier4(-1));

// 	cMaRequetePlainte		est un restRequête
WDObjet vWD_cMaRequetePlainte = WDVarNonAllouee.ref;
vWD_cMaRequetePlainte = new WDInstance( new WDHTTPRequete() );


// 	cMaRequetePlainte.URL			= sUrldataplainte
vWD_cMaRequetePlainte.setProp(EWDPropriete.PROP_URL,vWD_sUrldataplainte);

// 	cMaRequetePlainte.Contenu		= bufRésultat
vWD_cMaRequetePlainte.setProp(EWDPropriete.PROP_CONTENU,vWD_bufResultat);

// 	cMaRequetePlainte.ContentType	= "application/json"
vWD_cMaRequetePlainte.setProp(EWDPropriete.PROP_CONTENTTYPE,"application/json");

// 	cMaRequetePlainte.Méthode		= httpPost
vWD_cMaRequetePlainte.setProp(EWDPropriete.PROP_METHODE,2);

// 	cMaRequetePlainte.TimeoutConnexion=60000
vWD_cMaRequetePlainte.setProp(EWDPropriete.PROP_TIMEOUTCONNEXION,60000);

// 	cMaReponsePlainte est un restRéponse = RESTEnvoie(cMaRequetePlainte)
WDObjet vWD_cMaReponsePlainte = WDVarNonAllouee.ref;
vWD_cMaReponsePlainte = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponsePlainte.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequetePlainte));


// 	SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 		Erreur("Un problème est survenu. Veuillez réessayer plus tard")
WDAPIDialogue.erreur("Un problème est survenu. Veuillez réessayer plus tard");

}
else
{
// 		Désérialise(unePlainteValide,cMaReponsePlainte.Contenu,psdJSON)
WDAPISerialise.deserialise(GWDPTono_CF.getInstance().vWD_unePlainteValide,vWD_cMaReponsePlainte.getProp(EWDPropriete.PROP_CONTENU),1024);

// 		PlainteId		est un entier	= unePlainteValide.Id
WDObjet vWD_PlainteId = new WDEntier4();


vWD_PlainteId.setValeur(GWDPTono_CF.getInstance().vWD_unePlainteValide.checkType(GWDCPlainteValide.class).mWD_Id);


// 		plaintebuffer	est une Buffer 
WDObjet vWD_plaintebuffer = new WDBuffer();



// 		cMaRequete		est un restRequête
WDObjet vWD_cMaRequete = WDVarNonAllouee.ref;
vWD_cMaRequete = new WDInstance( new WDHTTPRequete() );


// 		cMaRequete.URL				= sUrldatafileplainte//"http://localhost:64658/api/requestplaintes/Savetabfileplainte"
vWD_cMaRequete.setProp(EWDPropriete.PROP_URL,vWD_sUrldatafileplainte);

// 		POUR TOUT t_fileplainte SUR IDt_fileplainte
IWDParcours parcours1 = null;
try
{
parcours1 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"), WDAPIHF.getRubriqueSansCasseNiAccent("idt_fileplainte"), true);
while(parcours1.testParcours())
{
// 			unFilesPlainte.FileName		= fExtraitChemin(t_fileplainte.FileName, fFichier+fExtension)
GWDPTono_CF.getInstance().vWD_unFilesPlainte.checkType(GWDCFilesPlainte.class).mWD_FileName.setValeur(WDAPIFichier.fExtraitChemin(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("filename").getString(),12));

// 			unFilesPlainte.PlainteId	= PlainteId
GWDPTono_CF.getInstance().vWD_unFilesPlainte.checkType(GWDCFilesPlainte.class).mWD_PlainteId.setValeur(vWD_PlainteId);

// 			unFilesPlainte.TypeContenu	= t_fileplainte.TypeContenu
GWDPTono_CF.getInstance().vWD_unFilesPlainte.checkType(GWDCFilesPlainte.class).mWD_TypeContenu.setValeur(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu"));

// 			TableauAjouteLigne(tabFilesPlainte,unFilesPlainte)
WDAPITableau.tableauAjouteLigne(GWDPTono_CF.getInstance().vWD_tabFilesPlainte,new WDObjet[] {GWDPTono_CF.getInstance().vWD_unFilesPlainte} );

}
}
finally
{
if(parcours1 != null)
{
parcours1.finParcours();
}
}


// 		Sérialise(tabFilesPlainte,plaintebuffer,psdJSON)
WDAPISerialise.serialise(GWDPTono_CF.getInstance().vWD_tabFilesPlainte,vWD_plaintebuffer,1024);

// 		cMaRequete.Contenu		= plaintebuffer
vWD_cMaRequete.setProp(EWDPropriete.PROP_CONTENU,vWD_plaintebuffer);

// 		cMaRequete.ContentType	= "application/json"
vWD_cMaRequete.setProp(EWDPropriete.PROP_CONTENTTYPE,"application/json");

// 		cMaRequete.Méthode		= httpPost
vWD_cMaRequete.setProp(EWDPropriete.PROP_METHODE,2);

// 		cMaReponse est un restRéponse = RESTEnvoie(cMaRequete)
WDObjet vWD_cMaReponse = WDVarNonAllouee.ref;
vWD_cMaReponse = new WDInstance( new WDHTTPReponse() );

vWD_cMaReponse.setValeur(WDAPIHttp.HTTPEnvoie(vWD_cMaRequete));


// 		SI ErreurDétectée ALORS
if(WDObjet.ErreurDetectee.getBoolean())
{
// 			Erreur("Un problème est survenu. Veuillez réessayer plus tard")
WDAPIDialogue.erreur("Un problème est survenu. Veuillez réessayer plus tard");

}

// 		nCpter		est un entier	= 0
WDObjet vWD_nCpter = new WDEntier4();


vWD_nCpter.setValeur(0);


// 		nCpterSend	est un entier	= 0
WDObjet vWD_nCpterSend = new WDEntier4();


vWD_nCpterSend.setValeur(0);


// 		POUR TOUT t_fileplainte SUR IDt_fileplainte
IWDParcours parcours2 = null;
try
{
parcours2 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"), WDAPIHF.getRubriqueSansCasseNiAccent("idt_fileplainte"), true);
while(parcours2.testParcours())
{
// 			nCpter=nCpter+1
vWD_nCpter.setValeur(vWD_nCpter.opPlus(1));

// 			HTTPCréeFormulaire("FORM")
WDAPIHttp.HTTPCreeFormulaire("FORM");

// 			HTTPAjouteFichier("FORM", "photo", t_fileplainte.FileName)
WDAPIHttp.HTTPAjouteFichier("FORM","photo",WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("filename").getString());

// 			SI HTTPEnvoieFormulaire("FORM", gsUrlapi+"requestplaintes/Savefiles?Id="+PlainteId) ALORS
if(WDAPIHttp.HTTPEnvoieFormulaire("FORM",GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/Savefiles?Id=").opPlus(vWD_PlainteId)).getBoolean())
{
// 				nCpterSend=nCpterSend+1
vWD_nCpterSend.setValeur(vWD_nCpterSend.opPlus(1));

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


// 		si nCpter=nCpterSend ALORS
if(vWD_nCpter.opEgal(vWD_nCpterSend))
{
// 				Info("Votre plainte a été réceptionnée avec succès!")
WDAPIDialogue.info("Votre plainte a été réceptionnée avec succès!");

}
else
{
// 				Erreur("Un problème est survenu. Veuillez réessayer plus tard")
WDAPIDialogue.erreur("Un problème est survenu. Veuillez réessayer plus tard");

}

// 		Sablier(Faux)    
WDAPIDivers.sablier(new WDBooleen(false).getInt());

// 		TitreSuivant("")
WDAPIFenetre.titreSuivant("");

// 		Ferme()
WDAPIFenetre.ferme();

}

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
public GWDBTN_Terminer mWD_BTN_Terminer;

/**
 * LIB_Informations_sur_la_plainte
 */
class GWDLIB_Informations_sur_la_plainte extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°4 de FEN_Plainte_MOBILE.LIB_Informations_sur_la_plainte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376669919812651992l);

super.setChecksum("1338356195");

super.setNom("LIB_Informations_sur_la_plainte");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Informations sur la plainte");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(-6, 8);

super.setTailleInitiale(333, 28);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(4);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0xF1000000, 0xF39621, creerPolice_GEN("Roboto", -9.000000, 1), 3, 0, 0x222222);

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
public GWDLIB_Informations_sur_la_plainte mWD_LIB_Informations_sur_la_plainte;

/**
 * LIB_Statut_de_l_accusé
 */
class GWDLIB_Statut_de_l_accuse extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°5 de FEN_Plainte_MOBILE.LIB_Statut_de_l_accusé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376677307213498485l);

super.setChecksum("1395455288");

super.setNom("LIB_Statut_de_l_accusé");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Entité de l'accusé :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(10, 53);

super.setTailleInitiale(184, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(5);

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
public GWDLIB_Statut_de_l_accuse mWD_LIB_Statut_de_l_accuse;

/**
 * LIB_Identité_de_l_accusé
 */
class GWDLIB_Identite_de_l_accuse extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°6 de FEN_Plainte_MOBILE.LIB_Identité_de_l_accusé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376677483308378534l);

super.setChecksum("1396676242");

super.setNom("LIB_Identité_de_l_accusé");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Identité de l'accusé :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 421);

super.setTailleInitiale(221, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(6);

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
public GWDLIB_Identite_de_l_accuse mWD_LIB_Identite_de_l_accuse;

/**
 * LIB_Type_de_Preuve
 */
class GWDLIB_Type_de_Preuve extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°7 de FEN_Plainte_MOBILE.LIB_Type_de_Preuve
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2376678140442459639l);

super.setChecksum("1400761212");

super.setNom("LIB_Type_de_Preuve");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Type de Preuve :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(10, 492);

super.setTailleInitiale(187, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(7);

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
public GWDLIB_Type_de_Preuve mWD_LIB_Type_de_Preuve;

/**
 * LIB_Statut_de_l_accusé1
 */
class GWDLIB_Statut_de_l_accuse1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°8 de FEN_Plainte_MOBILE.LIB_Statut_de_l_accusé1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377190967398378909l);

super.setChecksum("671722892");

super.setNom("LIB_Statut_de_l_accusé1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Province de l'accusé :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(9, 196);

super.setTailleInitiale(184, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(8);

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
public GWDLIB_Statut_de_l_accuse1 mWD_LIB_Statut_de_l_accuse1;

/**
 * COMBO_Province
 */
class GWDCOMBO_Province extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°9 de FEN_Plainte_MOBILE.COMBO_Province
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,302,40);
super.setQuid(2377190967398641068l);

super.setChecksum("678902077");

super.setNom("COMBO_Province");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 216);

super.setTailleInitiale(302, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(9);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(3);

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

// HLitRecherchePremier(t_province,LibelleVille,COMBO_Province..ValeurAffichée)
// HLitRecherchePremier(t_province,LibelleVille,COMBO_Province..ValeurAffichée)
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
 * LIB_Service_d_attache_de_l_accusé
 */
class GWDLIB_Service_d_attache_de_l_accuse extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°10 de FEN_Plainte_MOBILE.LIB_Service_d_attache_de_l_accusé
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377191100544230687l);

super.setChecksum("673588525");

super.setNom("LIB_Service_d_attache_de_l_accusé");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Service d'attache de l'accusé :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(8, 350);

super.setTailleInitiale(221, 20);

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(10);

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
public GWDLIB_Service_d_attache_de_l_accuse mWD_LIB_Service_d_attache_de_l_accuse;

/**
 * SAI_ServiceAccuse
 */
class GWDSAI_ServiceAccuse extends WDChampSaisieSimple
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°11 de FEN_Plainte_MOBILE.SAI_ServiceAccuse
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(1,2,301,36);
super.setQuid(2377191100544361774l);

super.setChecksum("673719156");

super.setNom("SAI_ServiceAccuse");

super.setType(20001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setTaille(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(9, 373);

super.setTailleInitiale(302, 40);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setMotDePasse(false);

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("2"));

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(11);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setIndication("< Nom du Service >");

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
public GWDSAI_ServiceAccuse mWD_SAI_ServiceAccuse;

/**
 * LIB_Statut_de_l_accusé2
 */
class GWDLIB_Statut_de_l_accuse2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°12 de FEN_Plainte_MOBILE.LIB_Statut_de_l_accusé2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2377191654597697306l);

super.setChecksum("676274089");

super.setNom("LIB_Statut_de_l_accusé2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Motif de la plainte :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(10, 122);

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
 * LIB_Localisation_du_service_de
 */
class GWDLIB_Localisation_du_service_de extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°13 de FEN_Plainte_MOBILE.LIB_Localisation_du_service_de
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2378583971270381902l);

super.setChecksum("621069355");

super.setNom("LIB_Localisation_du_service_de");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Localisation du service de l'accusé :");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(10, 268);

super.setTailleInitiale(302, 20);

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
public GWDLIB_Localisation_du_service_de mWD_LIB_Localisation_du_service_de;

/**
 * COMBO_Commune
 */
class GWDCOMBO_Commune extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°14 de FEN_Plainte_MOBILE.COMBO_Commune
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,302,40);
super.setQuid(2378583971270644061l);

super.setChecksum("630872540");

super.setNom("COMBO_Commune");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 298);

super.setTailleInitiale(302, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(14);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(4);

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
 * COMBO_TypePlainte
 */
class GWDCOMBO_TypePlainte extends WDCombo
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°15 de FEN_Plainte_MOBILE.COMBO_TypePlainte
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,2,302,40);
super.setQuid(2378718309263381742l);

super.setChecksum("631533211");

super.setNom("COMBO_TypePlainte");

super.setType(10002);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(10, 141);

super.setTailleInitiale(302, 44);

super.setValeurInitiale("");

super.setPlan(0);

super.setCadrageHorizontal(0);

super.setContenuInitial("");

super.setTriee(false);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(15);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setNumTab(2);

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
 * Traitement: Sélection d'une ligne de COMBO_TypePlainte
 */
public void selectionLigne()
{
super.selectionLigne();

// si MoiMême..ValeurAffichée="Autres..." ALORS
// si MoiMême..ValeurAffichée="Autres..." ALORS
if(WDContexte.getMoiMeme().getProp(EWDPropriete.PROP_VALEURAFFICHEE).opEgal("Autres..."))
{
// 	gnCheckEntite=1
GWDPTono_CF.getInstance().vWD_gnCheckEntite.setValeur(1);

// 	OuvreFenêtreMobile(FEN_MotifPlainte)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_MotifPlainte);

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
public GWDCOMBO_TypePlainte mWD_COMBO_TypePlainte;

/**
 * SEL_TypePreuve
 */
class GWDSEL_TypePreuve extends WDSelecteur
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°16 de FEN_Plainte_MOBILE.SEL_TypePreuve
////////////////////////////////////////////////////////////////////////////

/**
 * SEL_TypePreuve_Option_0
 */
class GWDSEL_TypePreuve_Option_0 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.SEL_TypePreuve.SEL_TypePreuve_Option_0
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Sans Preuve");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("0")));

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_TypePreuve_Option_0 mWD_SEL_TypePreuve_Option_0 = new GWDSEL_TypePreuve_Option_0();

/**
 * SEL_TypePreuve_Option_1
 */
class GWDSEL_TypePreuve_Option_1 extends WDBoutonRadio
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plainte_MOBILE.SEL_TypePreuve.SEL_TypePreuve_Option_1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setLibelle("Avec Preuve");

super.setHauteurOption(0);

super.setValeurRenvoyee((new WDChaineU("1")));

super.setStyleLibelleOption(0x212121, creerPolice_GEN("Roboto", -8.000000, 0));

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDSEL_TypePreuve_Option_1 mWD_SEL_TypePreuve_Option_1 = new GWDSEL_TypePreuve_Option_1();
/**
 * Initialise tous les champs de FEN_Plainte_MOBILE.SEL_TypePreuve
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE.SEL_TypePreuve
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
super.ajouterOption(mWD_SEL_TypePreuve_Option_0);
super.ajouterOption(mWD_SEL_TypePreuve_Option_1);
positionnerOptions();
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setRectCompPrincipal(0,0,302,42);
super.setQuid(2379549183570240657l);

super.setChecksum("625756833");

super.setNom("SEL_TypePreuve");

super.setType(6);

super.setBulle("");

super.setLibelle("&Sélecteur 2 colonnes");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(8, 520);

super.setTailleInitiale(302, 42);

super.setValeurInitiale("1");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(16);

super.setAncrageInitial(0, 1000, 1000, 1000, 1000, 0);

super.setNumTab(7);

super.setLettreAppel(65535);

super.setPersistant(false);

super.setParamOptions(false, 2, false, true, false);

super.setValeurRenvoyeeParProgrammation(true);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(false);

super.setStyleLibelle(0x212121, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x808080);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xF1000000, 0xF3000000, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1));


super.setImageCoche("E:\\Mes projets\\Projet ROGER\\Tono CF\\Gabarits\\WM\\210 Material Design Blue\\Material Design Blue_Radio@dpi160.png?E12_8O", 1);

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: A chaque modification de SEL_TypePreuve
 */
public void modification()
{
super.modification();

// si SEL_TypePreuve..Valeur=1 ALORS
// si SEL_TypePreuve..Valeur=1 ALORS
if(this.getProp(EWDPropriete.PROP_VALEUR).opEgal(1))
{
// 	ZM_ACTION1..Visible=vrai
mWD_ZM_ACTION1.setProp(EWDPropriete.PROP_VISIBLE,true);

// 	ZM_ACTION2..Visible=Vrai
mWD_ZM_ACTION2.setProp(EWDPropriete.PROP_VISIBLE,true);

// 	ZM_ACTION3..Visible=Vrai
mWD_ZM_ACTION3.setProp(EWDPropriete.PROP_VISIBLE,true);

// 	nCpterImage est un entier=0
WDObjet vWD_nCpterImage = new WDEntier4();


vWD_nCpterImage.setValeur(0);


// 	nCpterSon est un entier=0
WDObjet vWD_nCpterSon = new WDEntier4();


vWD_nCpterSon.setValeur(0);


// 	nCpterDocument est un entier=0
WDObjet vWD_nCpterDocument = new WDEntier4();


vWD_nCpterDocument.setValeur(0);


// 	pour TOUT t_fileplainte sur IDt_fileplainte
IWDParcours parcours3 = null;
try
{
parcours3 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"), WDAPIHF.getRubriqueSansCasseNiAccent("idt_fileplainte"), true);
while(parcours3.testParcours())
{
// 		si t_fileplainte.TypeContenu="Image" ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").opEgal("Image"))
{
// 			nCpterImage=nCpterImage+1
vWD_nCpterImage.setValeur(vWD_nCpterImage.opPlus(1));

}

// 		SI t_fileplainte.TypeContenu="Audio" ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").opEgal("Audio"))
{
// 			nCpterSon=nCpterSon+1
vWD_nCpterSon.setValeur(vWD_nCpterSon.opPlus(1));

}

// 		SI t_fileplainte.TypeContenu="Document" ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").opEgal("Document"))
{
// 			nCpterDocument=nCpterDocument+1
vWD_nCpterDocument.setValeur(vWD_nCpterDocument.opPlus(1));

}

}
}
finally
{
if(parcours3 != null)
{
parcours3.finParcours();
}
}


// 	LIB_TitreAction1..Libellé=nCpterDocument+" file(s)"
mWD_ZM_ACTION1.mWD_LIB_TitreAction1.setProp(EWDPropriete.PROP_LIBELLE,vWD_nCpterDocument.opPlus(" file(s)"));

// 	LIB_TitreAction2..Libellé=nCpterImage+" file(s)"
mWD_ZM_ACTION2.mWD_LIB_TitreAction2.setProp(EWDPropriete.PROP_LIBELLE,vWD_nCpterImage.opPlus(" file(s)"));

// 	LIB_TitreAction3..Libellé=nCpterSon+" file(s)"
mWD_ZM_ACTION3.mWD_LIB_TitreAction3.setProp(EWDPropriete.PROP_LIBELLE,vWD_nCpterSon.opPlus(" file(s)"));

}
else
{
// 	ZM_ACTION1..Visible	= Faux
mWD_ZM_ACTION1.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	ZM_ACTION2..Visible	= Faux
mWD_ZM_ACTION2.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	ZM_ACTION3..Visible	= Faux
mWD_ZM_ACTION3.setProp(EWDPropriete.PROP_VISIBLE,false);

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
public GWDSEL_TypePreuve mWD_SEL_TypePreuve;

/**
 * ZM_ACTION1
 */
class GWDZM_ACTION1 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°17 de FEN_Plainte_MOBILE.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION1_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction1
 */
class GWDLIB_TitreAction1 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.ZM_ACTION1.LIB_TitreAction1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2379628245443167406l);

super.setChecksum("740715854");

super.setNom("LIB_TitreAction1");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Document");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 63);

super.setTailleInitiale(77, 19);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x222222);

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
public GWDLIB_TitreAction1 mWD_LIB_TitreAction1 = new GWDLIB_TitreAction1();

/**
 * IMG_Doc
 */
class GWDIMG_Doc extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plainte_MOBILE.ZM_ACTION1.IMG_Doc
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410768308708213590l);

super.setChecksum("633820823");

super.setNom("IMG_Doc");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(19, 14);

super.setTailleInitiale(40, 39);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\FLS12428m@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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
 * Traitement: Clic sur IMG_Doc
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Explorateur_Documents)
// OuvreFenêtreMobile(FEN_Explorateur_Documents)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Documents);

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
public GWDIMG_Doc mWD_IMG_Doc = new GWDIMG_Doc();
class GWDZM_ACTION1_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Plainte_MOBILE.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction1.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction1);
mWD_IMG_Doc.initialiserObjet();
super.ajouterChamp(mWD_IMG_Doc);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(82);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION1_Ligne1 mWD_ZM_ACTION1_Ligne1 = new GWDZM_ACTION1_Ligne1();
/**
 * Initialise tous les champs de FEN_Plainte_MOBILE.ZM_ACTION1
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE.ZM_ACTION1
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION1_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION1_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2379628245442970798l);

super.setChecksum("740562110");

super.setNom("ZM_ACTION1");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(43, 558);

super.setTailleInitiale(79, 82);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setNumTab(8);

super.setAltitude(17);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION1
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
// ExécuteTraitement(IMG_Doc, trtclic)
WDAPIVM.executeTraitement(mWD_IMG_Doc,18);

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
public GWDZM_ACTION1 mWD_ZM_ACTION1;

/**
 * ZM_ACTION2
 */
class GWDZM_ACTION2 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°18 de FEN_Plainte_MOBILE.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION2_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction2
 */
class GWDLIB_TitreAction2 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.ZM_ACTION2.LIB_TitreAction2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2379629778754582623l);

super.setChecksum("748806756");

super.setNom("LIB_TitreAction2");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Image");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 63);

super.setTailleInitiale(77, 19);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x222222);

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
public GWDLIB_TitreAction2 mWD_LIB_TitreAction2 = new GWDLIB_TitreAction2();

/**
 * IMG_Image
 */
class GWDIMG_Image extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plainte_MOBILE.ZM_ACTION2.IMG_Image
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410769833424777140l);

super.setChecksum("636994648");

super.setNom("IMG_Image");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(18, 14);

super.setTailleInitiale(40, 39);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\FLS12428m@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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
 * Traitement: Clic sur IMG_Image
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Explorateur_Images)
// OuvreFenêtreMobile(FEN_Explorateur_Images)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Images);

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
public GWDIMG_Image mWD_IMG_Image = new GWDIMG_Image();
class GWDZM_ACTION2_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Plainte_MOBILE.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction2.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction2);
mWD_IMG_Image.initialiserObjet();
super.ajouterChamp(mWD_IMG_Image);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(82);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION2_Ligne1 mWD_ZM_ACTION2_Ligne1 = new GWDZM_ACTION2_Ligne1();
/**
 * Initialise tous les champs de FEN_Plainte_MOBILE.ZM_ACTION2
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE.ZM_ACTION2
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION2_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION2_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2379629778754386015l);

super.setChecksum("748653012");

super.setNom("ZM_ACTION2");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(122, 558);

super.setTailleInitiale(79, 82);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setNumTab(9);

super.setAltitude(18);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION2
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
// ExécuteTraitement(IMG_Image, trtclic)
WDAPIVM.executeTraitement(mWD_IMG_Image,18);

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
public GWDZM_ACTION2 mWD_ZM_ACTION2;

/**
 * ZM_ACTION3
 */
class GWDZM_ACTION3 extends WDZoneMultiligne
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°19 de FEN_Plainte_MOBILE.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * ZM_ACTION3_Ligne1
 */

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////

/**
 * LIB_TitreAction3
 */
class GWDLIB_TitreAction3 extends WDLibelle
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.ZM_ACTION3.LIB_TitreAction3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2379629817410673730l);

super.setChecksum("750192208");

super.setNom("LIB_TitreAction3");

super.setType(3);

super.setBulle("");

super.setTypeSaisie(0);

super.setMasqueSaisie(new WDChaineU("0"));

super.setLibelle("Audio");

super.setNote("", "");

super.setCurseurSouris(0);

super.setEtatInitial(0);

super.setPositionInitiale(1, 63);

super.setTailleInitiale(77, 19);

super.setPlan(0);

super.setCadrageHorizontal(1);

super.setCadrageVertical(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(1);

super.setAncrageInitial(8, 1000, 1000, 1000, 1000, 0);

super.setEllipse(0);

super.setTauxParallaxe(0, 0);

super.setPresenceLibelle(true);

super.setStyleLibelle(0x222222, 0xFFFFFFFF, creerPolice_GEN("Roboto", -5.000000, 0), 3, 0, 0x222222);

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
public GWDLIB_TitreAction3 mWD_LIB_TitreAction3 = new GWDLIB_TitreAction3();

/**
 * IMG_Audio
 */
class GWDIMG_Audio extends WDChampImage
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°2 de FEN_Plainte_MOBILE.ZM_ACTION3.IMG_Audio
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2410769893555446693l);

super.setChecksum("638122071");

super.setNom("IMG_Audio");

super.setType(30001);

super.setBulle("");

super.setLibelle("");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(21, 14);

super.setTailleInitiale(40, 39);

super.setValeurInitiale("E:\\Mes projets\\Projet ROGER\\Tono CF\\FLS12428m@dpi1x.png");

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(true);

super.setAltitude(2);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

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
 * Traitement: Clic sur IMG_Audio
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Explorateur_Audio_MOBILE)
// OuvreFenêtreMobile(FEN_Explorateur_Audio_MOBILE)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Audio_MOBILE);

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
public GWDIMG_Audio mWD_IMG_Audio = new GWDIMG_Audio();
class GWDZM_ACTION3_Ligne1 extends LigneZMLStatique
{
/**
 * Initialise tous les champs de FEN_Plainte_MOBILE.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_LIB_TitreAction3.initialiserObjet();
super.ajouterChamp(mWD_LIB_TitreAction3);
mWD_IMG_Audio.initialiserObjet();
super.ajouterChamp(mWD_IMG_Audio);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setHauteurInitiale(82);

super.setVisibleInitial(true);

super.setModeSelection(1);

initialiserSousObjets();
super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
}
public GWDZM_ACTION3_Ligne1 mWD_ZM_ACTION3_Ligne1 = new GWDZM_ACTION3_Ligne1();
/**
 * Initialise tous les champs de FEN_Plainte_MOBILE.ZM_ACTION3
 */
public void initialiserSousObjets()
{
////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE.ZM_ACTION3
////////////////////////////////////////////////////////////////////////////
super.initialiserSousObjets();
mWD_ZM_ACTION3_Ligne1.initialiserObjet();
super.ajouterLigne(mWD_ZM_ACTION3_Ligne1);
}
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setPresenceLibelle(false);

super.setQuid(2379629817410477122l);

super.setChecksum("750038464");

super.setNom("ZM_ACTION3");

super.setType(97);

super.setBulle("");

super.setLibelle("Zone multiligne");

super.setMenuContextuelSysteme();

super.setCurseurSouris(0);

super.setNote("", "");

super.setNavigable(true);

super.setEtatInitial(0);

super.setPositionInitiale(200, 558);

super.setTailleInitiale(79, 82);

super.setPlan(0);

super.setTailleMin(0, 0);

super.setTailleMax(2147483647, 2147483647);

super.setVisibleInitial(false);

super.setNumTab(10);

super.setAltitude(19);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setIndiceModeleLigneDynamique(0);

super.setTauxParallaxe(0, 0);

super.setCouleurTexteAutomatique(0xFF000001);

super.setStyleLibelle(0x222222, creerPolice_GEN("Roboto", -8.000000, 0), -1, 0, 0x222222);

super.setCouleurSeparateur(0xFFFFFFFF);

super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 0xFFFFFF, 0x7F7F7F, 0xFFFFFFFF, 2.000000, 2.000000, 1, 1), 0, 0, 0, 0);

super.setCadreInterne(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xFFFFFF, 4.500000, 4.500000, 1, 1));

super.setStyleSelection(WDCadreFactory.creerCadre_GEN(1, 0xE1E1E1, 0x616161, 0xE2E2E2, 2.000000, 2.000000, 1, 1));

activerEcoute();
initialiserSousObjets();
super.terminerInitialisation();
}

/**
 * Traitement: Sélection (clic) d'une ligne dans ZM_ACTION3
 */
public void selectionLigne()
//  Le clic sur la ZML execute simplement le code du bouton associé
{
super.selectionLigne();

// // Le clic sur la ZML execute simplement le code du bouton associé
// ExécuteTraitement(IMG_Audio, trtclic)
WDAPIVM.executeTraitement(mWD_IMG_Audio,18);

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
public GWDZM_ACTION3 mWD_ZM_ACTION3;

/**
 * BTN_ACTION1
 */
class GWDBTN_ACTION1 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°20 de FEN_Plainte_MOBILE.BTN_ACTION1
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2379628245443101870l);

super.setChecksum("740650774");

super.setNom("BTN_ACTION1");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(369, 518);

super.setTailleInitiale(68, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(20);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\WPS12445@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF5A542, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION1
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Explorateur_Documents)
// OuvreFenêtreMobile(FEN_Explorateur_Documents)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Documents);

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
public GWDBTN_ACTION1 mWD_BTN_ACTION1;

/**
 * BTN_ACTION2
 */
class GWDBTN_ACTION2 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°21 de FEN_Plainte_MOBILE.BTN_ACTION2
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2379629778754517087l);

super.setChecksum("748741676");

super.setNom("BTN_ACTION2");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(370, 586);

super.setTailleInitiale(68, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(21);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\WPS12120@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF5A542, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION2
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Explorateur_Images)
// OuvreFenêtreMobile(FEN_Explorateur_Images)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Images);

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
public GWDBTN_ACTION2 mWD_BTN_ACTION2;

/**
 * BTN_ACTION3
 */
class GWDBTN_ACTION3 extends WDBouton
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°22 de FEN_Plainte_MOBILE.BTN_ACTION3
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
super.initialiserObjet();
super.setFenetre( getWDFenetreThis() );
super.setQuid(2379629817410608194l);

super.setChecksum("750127128");

super.setNom("BTN_ACTION3");

super.setType(4);

super.setBulle("");

super.setLibelle("+");

super.setMenuContextuelSysteme();

super.setNote("", "");

super.setCurseurSouris(0);

super.setNavigable(false);

super.setEtatInitial(0);

super.setPositionInitiale(470, 537);

super.setTailleInitiale(68, 54);

super.setPlan(0);

super.setImageEtat(5);

super.setImageFondEtat(1);

super.setTailleMin(0, 0);

super.setTailleMax(134217727, 134217727);

super.setVisibleInitial(true);

super.setAltitude(22);

super.setAncrageInitial(4, 1000, 1000, 500, 1000, 0);

super.setNumTab(-1);

super.setLettreAppel(65535);

super.setTypeBouton(2);

super.setTypeActionPredefinie(0);

super.setBoutonOnOff(false);

super.setTauxParallaxe(1000, 0);

super.setLibelleVAlign(1);

super.setLibelleHAlign(5);

super.setPresenceLibelle(false);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\WPS10214@dpi1x.png?E5", 0, 2, 5, null, null, null);

super.setStyleLibelleRepos(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleSurvol(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setStyleLibelleEnfonce(0xFFFFFF, creerPolice_GEN("Trebuchet MS", -8.000000, 0), 0, 0x808080);

super.setCadreRepos(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreSurvol(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF39621, 2.000000, 2.000000, 1, 1));

super.setCadreEnfonce(WDCadreFactory.creerCadre_GEN(31, 0xF39621, 0x731600, 0xF5A542, 2.000000, 2.000000, 1, 1));

super.setImageFond9Images(new int[] {1,4,1,2,2,2,1,4,1}, 10, 10, 8, 8);

super.setImageFond("", 1, 0, 1, 1);

activerEcoute();
super.terminerInitialisation();
}

/**
 * Traitement: Clic sur BTN_ACTION3
 */
public void clicSurBoutonGauche()
{
super.clicSurBoutonGauche();

// OuvreFenêtreMobile(FEN_Explorateur_Audio_MOBILE)
// OuvreFenêtreMobile(FEN_Explorateur_Audio_MOBILE)
WDAPIFenetre.ouvreFille(GWDPTono_CF.getInstance().mWD_FEN_Explorateur_Audio_MOBILE);

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
public GWDBTN_ACTION3 mWD_BTN_ACTION3;

/**
 * ACTB_ActionBar
 */
class GWDACTB_ActionBar extends WDActionBar
{

////////////////////////////////////////////////////////////////////////////
// Déclaration des champs du fils n°1 de FEN_Plainte_MOBILE.ACTB_ActionBar
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
super.setQuid(2378585087966266755l);

super.setNom("OPT_Option");

super.setType(40001);

super.setLibelle("Option");

super.setEtat(0);

super.setImage("E:\\Mes projets\\Projet ROGER\\Tono CF\\FLS12428m@dpi1_5x.png");

super.setVisible(false);

super.setCochee(false);

super.setNumero(1);

super.setAffichageDansActionBar(true);

super.setIconePredefinie(-1);

activerEcoute();
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
super.setQuid(3024189436375393722l);

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
 * Traitement: Déclarations globales de FEN_Plainte_MOBILE
 */
public void declarerGlobale(WDObjet[] WD_tabParam)
{
// PROCÉDURE MaFenêtre()
super.declarerGlobale(WD_tabParam, 0, 0);
int WD_ntabParamLen = 0;
if(WD_tabParam!=null) WD_ntabParamLen = WD_tabParam.length;


// SEL_TypePreuve..Valeur=-1
mWD_SEL_TypePreuve.setProp(EWDPropriete.PROP_VALEUR,-1);

// bufRésultat				est un Buffer
vWD_bufResultat = new WDBuffer();

super.ajouterVariableGlobale("bufRésultat",vWD_bufResultat);



// bufRésultatPreuve				est un Buffer
vWD_bufResultatPreuve = new WDBuffer();

super.ajouterVariableGlobale("bufRésultatPreuve",vWD_bufResultatPreuve);



// sUrldataplainte			est une chaîne	= gsUrlapi+"requestplaintes/Saveplainte"
vWD_sUrldataplainte = new WDChaineU();

vWD_sUrldataplainte.setValeur(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/Saveplainte"));

super.ajouterVariableGlobale("sUrldataplainte",vWD_sUrldataplainte);



// sUrldatafileplainte		est une chaîne	= gsUrlapi+"requestplaintes/Savetabfileplainte"
vWD_sUrldatafileplainte = new WDChaineU();

vWD_sUrldatafileplainte.setValeur(GWDPTono_CF.getInstance().vWD_gsUrlapi.opPlus("requestplaintes/Savetabfileplainte"));

super.ajouterVariableGlobale("sUrldatafileplainte",vWD_sUrldatafileplainte);



// ListeAjoute(COMBO_Entite,"Sélectionnez l'entité de l'accusé")
WDAPIListe.listeAjoute(mWD_COMBO_Entite,"Sélectionnez l'entité de l'accusé");

// HLitPremier(t_entite_accuse, NomEntite)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse"),WDAPIHF.getRubriqueSansCasseNiAccent("nomentite"));

// TANTQUE PAS HEnDehors()
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 	ListeAjoute(COMBO_Entite, t_entite_accuse.NomEntite)
WDAPIListe.listeAjoute(mWD_COMBO_Entite,WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse").getRubriqueSansCasseNiAccent("nomentite").getString());

// 	HLitSuivant(t_entite_accuse, NomEntite)
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("t_entite_accuse"),WDAPIHF.getRubriqueSansCasseNiAccent("nomentite"));

}

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

// ListeAjoute(COMBO_TypePlainte,"Sélectionnez le type de plainte")
WDAPIListe.listeAjoute(mWD_COMBO_TypePlainte,"Sélectionnez le type de plainte");

// HLitPremier(t_typeplainte, LibelleTypePlainte)
WDAPIHF.hLitPremier(WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("libelletypeplainte"));

// TANTQUE PAS HEnDehors()
while((!WDAPIHF.hEnDehors().getBoolean()))
{
// 	ListeAjoute(COMBO_TypePlainte, t_typeplainte.LibelleTypePlainte)
WDAPIListe.listeAjoute(mWD_COMBO_TypePlainte,WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte").getRubriqueSansCasseNiAccent("libelletypeplainte").getString());

// 	HLitSuivant(t_typeplainte, LibelleTypePlainte)
WDAPIHF.hLitSuivant(WDAPIHF.getFichierSansCasseNiAccent("t_typeplainte"),WDAPIHF.getRubriqueSansCasseNiAccent("libelletypeplainte"));

}

}




/**
 * Traitement: Fermeture d'une fenêtre fille de FEN_Plainte_MOBILE
 */
public void fermetureFenetreFille()
{
super.fermetureFenetreFille();

// SI SEL_TypePreuve..Valeur=1 ALORS
// SI SEL_TypePreuve..Valeur=1 ALORS
if(mWD_SEL_TypePreuve.getProp(EWDPropriete.PROP_VALEUR).opEgal(1))
{
// 	ZM_ACTION1..Visible	= Vrai
mWD_ZM_ACTION1.setProp(EWDPropriete.PROP_VISIBLE,true);

// 	ZM_ACTION2..Visible	= Vrai
mWD_ZM_ACTION2.setProp(EWDPropriete.PROP_VISIBLE,true);

// 	ZM_ACTION3..Visible	= Vrai
mWD_ZM_ACTION3.setProp(EWDPropriete.PROP_VISIBLE,true);

// 	nCpterImage		est un entier	= 0
WDObjet vWD_nCpterImage = new WDEntier4();


vWD_nCpterImage.setValeur(0);


// 	nCpterSon		est un entier	= 0
WDObjet vWD_nCpterSon = new WDEntier4();


vWD_nCpterSon.setValeur(0);


// 	nCpterDocument	est un entier	= 0
WDObjet vWD_nCpterDocument = new WDEntier4();


vWD_nCpterDocument.setValeur(0);


// 	POUR TOUT t_fileplainte SUR IDt_fileplainte
IWDParcours parcours4 = null;
try
{
parcours4 = WDParcoursFichier.pourTout(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte"), WDAPIHF.getRubriqueSansCasseNiAccent("idt_fileplainte"), true);
while(parcours4.testParcours())
{
// 		SI t_fileplainte.TypeContenu="Image" ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").opEgal("Image"))
{
// 			nCpterImage=nCpterImage+1
vWD_nCpterImage.setValeur(vWD_nCpterImage.opPlus(1));

}

// 		SI t_fileplainte.TypeContenu="Audio" ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").opEgal("Audio"))
{
// 			nCpterSon=nCpterSon+1
vWD_nCpterSon.setValeur(vWD_nCpterSon.opPlus(1));

}

// 		SI t_fileplainte.TypeContenu="Document" ALORS
if(WDAPIHF.getFichierSansCasseNiAccent("t_fileplainte").getRubriqueSansCasseNiAccent("typecontenu").opEgal("Document"))
{
// 			nCpterDocument=nCpterDocument+1
vWD_nCpterDocument.setValeur(vWD_nCpterDocument.opPlus(1));

}

}
}
finally
{
if(parcours4 != null)
{
parcours4.finParcours();
}
}


// 	LIB_TitreAction1..Libellé	= nCpterDocument+" file(s)"
mWD_ZM_ACTION1.mWD_LIB_TitreAction1.setProp(EWDPropriete.PROP_LIBELLE,vWD_nCpterDocument.opPlus(" file(s)"));

// 	LIB_TitreAction2..Libellé	= nCpterImage+" file(s)"
mWD_ZM_ACTION2.mWD_LIB_TitreAction2.setProp(EWDPropriete.PROP_LIBELLE,vWD_nCpterImage.opPlus(" file(s)"));

// 	LIB_TitreAction3..Libellé	= nCpterSon+" file(s)"
mWD_ZM_ACTION3.mWD_LIB_TitreAction3.setProp(EWDPropriete.PROP_LIBELLE,vWD_nCpterSon.opPlus(" file(s)"));

}
else
{
// 	ZM_ACTION1..Visible	= Faux
mWD_ZM_ACTION1.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	ZM_ACTION2..Visible	= Faux
mWD_ZM_ACTION2.setProp(EWDPropriete.PROP_VISIBLE,false);

// 	ZM_ACTION3..Visible	= Faux
mWD_ZM_ACTION3.setProp(EWDPropriete.PROP_VISIBLE,false);

}

}




// Activation des écouteurs: 
public void activerEcoute()
{
}

////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
 public WDObjet vWD_bufResultat = WDVarNonAllouee.ref;
 public WDObjet vWD_bufResultatPreuve = WDVarNonAllouee.ref;
 public WDObjet vWD_sUrldataplainte = WDVarNonAllouee.ref;
 public WDObjet vWD_sUrldatafileplainte = WDVarNonAllouee.ref;
////////////////////////////////////////////////////////////////////////////
// Création des champs de la fenêtre FEN_Plainte_MOBILE
////////////////////////////////////////////////////////////////////////////
protected void creerChamps()
{
mWD_GR_Groupe1 = new WDGroupe();
mWD_SAI_Accuse = new GWDSAI_Accuse();
mWD_COMBO_Entite = new GWDCOMBO_Entite();
mWD_BTN_Terminer = new GWDBTN_Terminer();
mWD_LIB_Informations_sur_la_plainte = new GWDLIB_Informations_sur_la_plainte();
mWD_LIB_Statut_de_l_accuse = new GWDLIB_Statut_de_l_accuse();
mWD_LIB_Identite_de_l_accuse = new GWDLIB_Identite_de_l_accuse();
mWD_LIB_Type_de_Preuve = new GWDLIB_Type_de_Preuve();
mWD_LIB_Statut_de_l_accuse1 = new GWDLIB_Statut_de_l_accuse1();
mWD_COMBO_Province = new GWDCOMBO_Province();
mWD_LIB_Service_d_attache_de_l_accuse = new GWDLIB_Service_d_attache_de_l_accuse();
mWD_SAI_ServiceAccuse = new GWDSAI_ServiceAccuse();
mWD_LIB_Statut_de_l_accuse2 = new GWDLIB_Statut_de_l_accuse2();
mWD_LIB_Localisation_du_service_de = new GWDLIB_Localisation_du_service_de();
mWD_COMBO_Commune = new GWDCOMBO_Commune();
mWD_COMBO_TypePlainte = new GWDCOMBO_TypePlainte();
mWD_SEL_TypePreuve = new GWDSEL_TypePreuve();
mWD_ZM_ACTION1 = new GWDZM_ACTION1();
mWD_ZM_ACTION2 = new GWDZM_ACTION2();
mWD_ZM_ACTION3 = new GWDZM_ACTION3();
mWD_BTN_ACTION1 = new GWDBTN_ACTION1();
mWD_BTN_ACTION2 = new GWDBTN_ACTION2();
mWD_BTN_ACTION3 = new GWDBTN_ACTION3();
mWD_ACTB_ActionBar = new GWDACTB_ActionBar();
mWD__Menu = new GWDM_Menu();

}
////////////////////////////////////////////////////////////////////////////
// Initialisation de la fenêtre FEN_Plainte_MOBILE
////////////////////////////////////////////////////////////////////////////
public  void initialiserObjet()
{
declarerAgencement(0, 320, 720, 320, 568, 160, 0);
declarerAgencement(0, 568, 726, 320, 568, 160, 1);
declarerAgencement(0, 593, 811, 800, 1280, 216, 0);
declarerAgencement(0, 948, 724, 800, 1280, 216, 1);
super.setQuid(2376669919811603416l);

super.setChecksum("1344826260");

super.setNom("FEN_Plainte_MOBILE");

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

super.setTitre("Plainte / Dénonciation 2/2");

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
// Initialisation des groupes de champs de FEN_Plainte_MOBILE
////////////////////////////////////////////////////////////////////////////
mWD_GR_Groupe1.init("GR_Groupe1");
ajouter("GR_Groupe1", mWD_GR_Groupe1);


////////////////////////////////////////////////////////////////////////////
// Initialisation des champs de FEN_Plainte_MOBILE
////////////////////////////////////////////////////////////////////////////
mWD_SAI_Accuse.initialiserObjet();
super.ajouter("SAI_Accuse", mWD_SAI_Accuse);
mWD_COMBO_Entite.initialiserObjet();
super.ajouter("COMBO_Entite", mWD_COMBO_Entite);
mWD_BTN_Terminer.initialiserObjet();
super.ajouter("BTN_Terminer", mWD_BTN_Terminer);
mWD_LIB_Informations_sur_la_plainte.initialiserObjet();
super.ajouter("LIB_Informations_sur_la_plainte", mWD_LIB_Informations_sur_la_plainte);
mWD_LIB_Statut_de_l_accuse.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé", mWD_LIB_Statut_de_l_accuse);
mWD_LIB_Identite_de_l_accuse.initialiserObjet();
super.ajouter("LIB_Identité_de_l_accusé", mWD_LIB_Identite_de_l_accuse);
mWD_LIB_Type_de_Preuve.initialiserObjet();
super.ajouter("LIB_Type_de_Preuve", mWD_LIB_Type_de_Preuve);
mWD_LIB_Statut_de_l_accuse1.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé1", mWD_LIB_Statut_de_l_accuse1);
mWD_COMBO_Province.initialiserObjet();
super.ajouter("COMBO_Province", mWD_COMBO_Province);
mWD_LIB_Service_d_attache_de_l_accuse.initialiserObjet();
super.ajouter("LIB_Service_d_attache_de_l_accusé", mWD_LIB_Service_d_attache_de_l_accuse);
mWD_SAI_ServiceAccuse.initialiserObjet();
super.ajouter("SAI_ServiceAccuse", mWD_SAI_ServiceAccuse);
mWD_LIB_Statut_de_l_accuse2.initialiserObjet();
super.ajouter("LIB_Statut_de_l_accusé2", mWD_LIB_Statut_de_l_accuse2);
mWD_LIB_Localisation_du_service_de.initialiserObjet();
super.ajouter("LIB_Localisation_du_service_de", mWD_LIB_Localisation_du_service_de);
mWD_COMBO_Commune.initialiserObjet();
super.ajouter("COMBO_Commune", mWD_COMBO_Commune);
mWD_COMBO_TypePlainte.initialiserObjet();
super.ajouter("COMBO_TypePlainte", mWD_COMBO_TypePlainte);
mWD_SEL_TypePreuve.initialiserObjet();
super.ajouter("SEL_TypePreuve", mWD_SEL_TypePreuve);
mWD_ZM_ACTION1.initialiserObjet();
super.ajouter("ZM_ACTION1", mWD_ZM_ACTION1);
mWD_ZM_ACTION2.initialiserObjet();
super.ajouter("ZM_ACTION2", mWD_ZM_ACTION2);
mWD_ZM_ACTION3.initialiserObjet();
super.ajouter("ZM_ACTION3", mWD_ZM_ACTION3);
mWD_BTN_ACTION1.initialiserObjet();
super.ajouter("BTN_ACTION1", mWD_BTN_ACTION1);
mWD_BTN_ACTION2.initialiserObjet();
super.ajouter("BTN_ACTION2", mWD_BTN_ACTION2);
mWD_BTN_ACTION3.initialiserObjet();
super.ajouter("BTN_ACTION3", mWD_BTN_ACTION3);
mWD_ACTB_ActionBar.initialiserObjet();
super.ajouterActionBar(mWD_ACTB_ActionBar);
mWD__Menu.initialiserObjet();
ajouterMenuPrincipal(mWD__Menu);

super.terminerInitialisation();
}

////////////////////////////////////////////////////////////////////////////
// Agencements de FEN_Plainte_MOBILE
////////////////////////////////////////////////////////////////////////////
public  void appliquerAgencement(int nIndiceAgencement)
{
super.appliquerAgencement(nIndiceAgencement);
switch(nIndiceAgencement){
case 0 :
super.setTailleInitiale(320, 720);

break;
case 1 :
super.setTailleInitiale(568, 726);

break;
case 2 :
super.setTailleInitiale(593, 811);

break;
case 3 :
super.setTailleInitiale(948, 724);

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
return GWDPTono_CF.getInstance().mWD_FEN_Plainte_MOBILE;
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
