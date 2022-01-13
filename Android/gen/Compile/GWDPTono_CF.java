/**
 * Code généré par WINDEV Mobile - NE PAS MODIFIER !
 * Objet WINDEV Mobile : Projet
 * Classe Android : Tono CF
 * Date : 24/10/2021 18:20:33
 * Version de wdjava.dll  : 25.0.315.2
 */


package com.masociete.finalerte.wdgen;


import com.masociete.finalerte.*;
import fr.pcsoft.wdjava.core.types.*;
import fr.pcsoft.wdjava.core.*;
import fr.pcsoft.wdjava.core.application.*;
import fr.pcsoft.wdjava.geo.*;
import fr.pcsoft.wdjava.core.poo.*;
import fr.pcsoft.wdjava.core.allocation.*;
import fr.pcsoft.wdjava.core.types.collection.tableau.*;
import fr.pcsoft.wdjava.api.*;
/*Imports trouvés dans le code WL*/
/*Fin Imports trouvés dans le code WL*/





public class GWDPTono_CF extends WDProjet
{
private static GWDPTono_CF ms_instance = null;
/**
 * Accès au projet: Tono CF
 * Pour accéder au projet à partir de n'importe où: 
 * GWDPTono_CF.getInstance()
 */
public static GWDPTono_CF getInstance()
{
return (GWDPTono_CF) ms_instance;
}

 // FEN_APropos
public GWDFFEN_APropos mWD_FEN_APropos = new GWDFFEN_APropos();
 // accesseur de FEN_APropos
public GWDFFEN_APropos getFEN_APropos()
{
mWD_FEN_APropos.checkOuverture();
return mWD_FEN_APropos;
}

 // FEN_MENU
public GWDFFEN_MENU mWD_FEN_MENU = new GWDFFEN_MENU();
 // accesseur de FEN_MENU
public GWDFFEN_MENU getFEN_MENU()
{
mWD_FEN_MENU.checkOuverture();
return mWD_FEN_MENU;
}

 // FEN_Plainte
public GWDFFEN_Plainte mWD_FEN_Plainte = new GWDFFEN_Plainte();
 // accesseur de FEN_Plainte
public GWDFFEN_Plainte getFEN_Plainte()
{
mWD_FEN_Plainte.checkOuverture();
return mWD_FEN_Plainte;
}

 // FEN_Plainte_MOBILE
public GWDFFEN_Plainte_MOBILE mWD_FEN_Plainte_MOBILE = new GWDFFEN_Plainte_MOBILE();
 // accesseur de FEN_Plainte_MOBILE
public GWDFFEN_Plainte_MOBILE getFEN_Plainte_MOBILE()
{
mWD_FEN_Plainte_MOBILE.checkOuverture();
return mWD_FEN_Plainte_MOBILE;
}

 // FEN_TypeDenonciation
public GWDFFEN_TypeDenonciation mWD_FEN_TypeDenonciation = new GWDFFEN_TypeDenonciation();
 // accesseur de FEN_TypeDenonciation
public GWDFFEN_TypeDenonciation getFEN_TypeDenonciation()
{
mWD_FEN_TypeDenonciation.checkOuverture();
return mWD_FEN_TypeDenonciation;
}

 // FEN_Explorateur_Images
public GWDFFEN_Explorateur_Images mWD_FEN_Explorateur_Images = new GWDFFEN_Explorateur_Images();
 // accesseur de FEN_Explorateur_Images
public GWDFFEN_Explorateur_Images getFEN_Explorateur_Images()
{
mWD_FEN_Explorateur_Images.checkOuverture();
return mWD_FEN_Explorateur_Images;
}

 // FEN_Explorateur_Audio_MOBILE
public GWDFFEN_Explorateur_Audio_MOBILE mWD_FEN_Explorateur_Audio_MOBILE = new GWDFFEN_Explorateur_Audio_MOBILE();
 // accesseur de FEN_Explorateur_Audio_MOBILE
public GWDFFEN_Explorateur_Audio_MOBILE getFEN_Explorateur_Audio_MOBILE()
{
mWD_FEN_Explorateur_Audio_MOBILE.checkOuverture();
return mWD_FEN_Explorateur_Audio_MOBILE;
}

 // FEN_Explorateur_Documents
public GWDFFEN_Explorateur_Documents mWD_FEN_Explorateur_Documents = new GWDFFEN_Explorateur_Documents();
 // accesseur de FEN_Explorateur_Documents
public GWDFFEN_Explorateur_Documents getFEN_Explorateur_Documents()
{
mWD_FEN_Explorateur_Documents.checkOuverture();
return mWD_FEN_Explorateur_Documents;
}

 // FEN_MotifPlainte
public GWDFFEN_MotifPlainte mWD_FEN_MotifPlainte = new GWDFFEN_MotifPlainte();
 // accesseur de FEN_MotifPlainte
public GWDFFEN_MotifPlainte getFEN_MotifPlainte()
{
mWD_FEN_MotifPlainte.checkOuverture();
return mWD_FEN_MotifPlainte;
}

 // FEN_Suivi_Plainte
public GWDFFEN_Suivi_Plainte mWD_FEN_Suivi_Plainte = new GWDFFEN_Suivi_Plainte();
 // accesseur de FEN_Suivi_Plainte
public GWDFFEN_Suivi_Plainte getFEN_Suivi_Plainte()
{
mWD_FEN_Suivi_Plainte.checkOuverture();
return mWD_FEN_Suivi_Plainte;
}

 // FEN_Nos_annonces
public GWDFFEN_Nos_annonces mWD_FEN_Nos_annonces = new GWDFFEN_Nos_annonces();
 // accesseur de FEN_Nos_annonces
public GWDFFEN_Nos_annonces getFEN_Nos_annonces()
{
mWD_FEN_Nos_annonces.checkOuverture();
return mWD_FEN_Nos_annonces;
}

 // FEN_Message
public GWDFFEN_Message mWD_FEN_Message = new GWDFFEN_Message();
 // accesseur de FEN_Message
public GWDFFEN_Message getFEN_Message()
{
mWD_FEN_Message.checkOuverture();
return mWD_FEN_Message;
}

 // FEN_Explorateur_Documents_2
public GWDFFEN_Explorateur_Documents_2 mWD_FEN_Explorateur_Documents_2 = new GWDFFEN_Explorateur_Documents_2();
 // accesseur de FEN_Explorateur_Documents_2
public GWDFFEN_Explorateur_Documents_2 getFEN_Explorateur_Documents_2()
{
mWD_FEN_Explorateur_Documents_2.checkOuverture();
return mWD_FEN_Explorateur_Documents_2;
}

 // FEN_Plainte_MOBILE_2
public GWDFFEN_Plainte_MOBILE_2 mWD_FEN_Plainte_MOBILE_2 = new GWDFFEN_Plainte_MOBILE_2();
 // accesseur de FEN_Plainte_MOBILE_2
public GWDFFEN_Plainte_MOBILE_2 getFEN_Plainte_MOBILE_2()
{
mWD_FEN_Plainte_MOBILE_2.checkOuverture();
return mWD_FEN_Plainte_MOBILE_2;
}


 // Constructeur de la classe GWDPTono_CF
public GWDPTono_CF()
{
ms_instance = this;
// Définition des langues du projet
setLangueProjet(new int[] {1}, new int[] {0}, 1, false);
ajouterCollectionProcedures(GWDCPCOL_Extension.getInstance());

// Palette des couleurs
setPaletteCouleurGabarit(new int[] {0x394AE1, 0x26A0FA, 0x6DBC61, 0x85A800, 0xD2AC54, 0xC9822B, 0xA95CF8, 0xB86592, 0xB74A5E, 0x654E44, 0xA5A595});
ajouterFenetre("FEN_APropos", mWD_FEN_APropos);
ajouterFenetre("FEN_MENU", mWD_FEN_MENU);
ajouterFenetre("FEN_Plainte", mWD_FEN_Plainte);
ajouterFenetre("FEN_Plainte_MOBILE", mWD_FEN_Plainte_MOBILE);
ajouterFenetre("FEN_TypeDenonciation", mWD_FEN_TypeDenonciation);
ajouterFenetre("FEN_Explorateur_Images", mWD_FEN_Explorateur_Images);
ajouterFenetre("FEN_Explorateur_Audio_MOBILE", mWD_FEN_Explorateur_Audio_MOBILE);
ajouterFenetre("FEN_Explorateur_Documents", mWD_FEN_Explorateur_Documents);
ajouterFenetre("FEN_MotifPlainte", mWD_FEN_MotifPlainte);
ajouterFenetre("FEN_Suivi_Plainte", mWD_FEN_Suivi_Plainte);
ajouterFenetre("FEN_Nos_annonces", mWD_FEN_Nos_annonces);
ajouterFenetre("FEN_Message", mWD_FEN_Message);
ajouterFenetre("FEN_Explorateur_Documents_2", mWD_FEN_Explorateur_Documents_2);
ajouterFenetre("FEN_Plainte_MOBILE_2", mWD_FEN_Plainte_MOBILE_2);

ajouterRequeteWDR( new GWDRREQ_CommuneByProvince() );
ajouterRequeteWDR( new GWDRREQ_DirectionByEntite() );
ajouterRequeteWDR( new GWDRREQ_TerritoireByDirection() );
ajouterRequeteWDR( new GWDRREQ_TypePlainteByEntite() );


}

// Code de déclaration de Tono CF
public void trtInitProjet()
// New add
{
// //New add
// TypeFile est une chaîne=""
vWD_TypeFile = new WDChaineU();

vWD_TypeFile.setValeur("");

super.ajouterVariableGlobale("TypeFile",vWD_TypeFile);



// CONSTANT

// gnModeCopierCouper		est un entier						= AucuneOpération
vWD_gnModeCopierCouper = new WDEntier4();

vWD_gnModeCopierCouper.setValeur(3);

super.ajouterVariableGlobale("gnModeCopierCouper",vWD_gnModeCopierCouper);



// gsFichierCopierCouper	est une chaîne <section critique>	= ""
vWD_gsFichierCopierCouper = new WDChaineU();

vWD_gsFichierCopierCouper.setValeur("");

super.ajouterVariableGlobale("gsFichierCopierCouper",vWD_gsFichierCopierCouper);



// gsFichierListe			est une chaîne						= ""
vWD_gsFichierListe = new WDChaineU();

vWD_gsFichierListe.setValeur("");

super.ajouterVariableGlobale("gsFichierListe",vWD_gsFichierListe);



// gsUrlapi		est une chaîne	="http://finalertemanage.com/tonocfapi/api/"//"http://sige-drc.com/tonocfapi/api/" //"http://localhost:64658/api/"//
vWD_gsUrlapi = new WDChaineU();

vWD_gsUrlapi.setValeur("http://finalertemanage.com/tonocfapi/api/");

super.ajouterVariableGlobale("gsUrlapi",vWD_gsUrlapi);



// sReponses		est une chaîne ANSI
vWD_sReponses = new WDChaineA();

super.ajouterVariableGlobale("sReponses",vWD_sReponses);



// sErrorResponses	est une chaîne ANSI
vWD_sErrorResponses = new WDChaineA();

super.ajouterVariableGlobale("sErrorResponses",vWD_sErrorResponses);



// sCodeStatus		est une chaîne ANSI
vWD_sCodeStatus = new WDChaineA();

super.ajouterVariableGlobale("sCodeStatus",vWD_sCodeStatus);



// gnTypedenonciation est un entier
vWD_gnTypedenonciation = new WDEntier4();

super.ajouterVariableGlobale("gnTypedenonciation",vWD_gnTypedenonciation);



// gnTypePreuve1 est un entier
vWD_gnTypePreuve1 = new WDEntier4();

super.ajouterVariableGlobale("gnTypePreuve1",vWD_gnTypePreuve1);



// gnTypePreuve2 est un entier
vWD_gnTypePreuve2 = new WDEntier4();

super.ajouterVariableGlobale("gnTypePreuve2",vWD_gnTypePreuve2);



// gnTypePreuve3 est un entier
vWD_gnTypePreuve3 = new WDEntier4();

super.ajouterVariableGlobale("gnTypePreuve3",vWD_gnTypePreuve3);



// gnCheckEntite est un entier=0
vWD_gnCheckEntite = new WDEntier4();

vWD_gnCheckEntite.setValeur(0);

super.ajouterVariableGlobale("gnCheckEntite",vWD_gnCheckEntite);



// pos est une géoPosition
vWD_pos = new WDInstance( new WDGeoPosition() );

super.ajouterVariableGlobale("pos",vWD_pos);



// MaPosition est une géoPosition
vWD_MaPosition = new WDInstance( new WDGeoPosition() );

super.ajouterVariableGlobale("MaPosition",vWD_MaPosition);



// Province est une Structure

// resultatprovince	est un tableau de Province
vWD_resultatprovince = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCProvince();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCProvince.class;}		});
super.ajouterVariableGlobale("resultatprovince",vWD_resultatprovince);



// Commune				est une Structure

// resultatterritoire est un tableau de Commune
vWD_resultatterritoire = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCCommune();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCCommune.class;}		});
super.ajouterVariableGlobale("resultatterritoire",vWD_resultatterritoire);



// EntiteAccuse est une Structure

// resultatEntiteAccuse	est un tableau de EntiteAccuse
vWD_resultatEntiteAccuse = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCEntiteAccuse();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCEntiteAccuse.class;}		});
super.ajouterVariableGlobale("resultatEntiteAccuse",vWD_resultatEntiteAccuse);



// DirectionAccuse				est une Structure

// resultatDirectionAccuse est un tableau de DirectionAccuse
vWD_resultatDirectionAccuse = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCDirectionAccuse();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCDirectionAccuse.class;}		});
super.ajouterVariableGlobale("resultatDirectionAccuse",vWD_resultatDirectionAccuse);



// RapportPlainte 	est une Structure

// UnePlainte est un RapportPlainte
vWD_UnePlainte = new GWDCRapportPlainte();

super.ajouterVariableGlobale("UnePlainte",vWD_UnePlainte);



// FilesPlainte				est une Structure

// unFilesPlainte est un FilesPlainte
vWD_unFilesPlainte = new GWDCFilesPlainte();

super.ajouterVariableGlobale("unFilesPlainte",vWD_unFilesPlainte);



// tabFilesPlainte est un tableau de FilesPlainte
vWD_tabFilesPlainte = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCFilesPlainte();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCFilesPlainte.class;}		});
super.ajouterVariableGlobale("tabFilesPlainte",vWD_tabFilesPlainte);



// TypePlainte	est une Structure

// resultatTypePlainte est un tableau de TypePlainte
vWD_resultatTypePlainte = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCTypePlainte();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCTypePlainte.class;}		});
super.ajouterVariableGlobale("resultatTypePlainte",vWD_resultatTypePlainte);



// PlainteValide est une Structure

// tabPlainte est un tableau de PlainteValide
vWD_tabPlainte = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCPlainteValide();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCPlainteValide.class;}		});
super.ajouterVariableGlobale("tabPlainte",vWD_tabPlainte);



// unePlainteValide est un PlainteValide
vWD_unePlainteValide = new GWDCPlainteValide();

super.ajouterVariableGlobale("unePlainteValide",vWD_unePlainteValide);



// SuiviPlainte est une Structure

// tabSuiviPlainte est un tableau de SuiviPlainte
vWD_tabSuiviPlainte = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCSuiviPlainte();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCSuiviPlainte.class;}		});
super.ajouterVariableGlobale("tabSuiviPlainte",vWD_tabSuiviPlainte);



// unePlainteFound est un SuiviPlainte
vWD_unePlainteFound = new GWDCSuiviPlainte();

super.ajouterVariableGlobale("unePlainteFound",vWD_unePlainteFound);



// Annonces est une Structure

// tabAnnonces	est un tableau de Annonces
vWD_tabAnnonces = new WDTableauSimple(1, new int[]{0}, 0, new IWDAllocateur(){public WDObjet creerInstance(){return new GWDCAnnonces();}	public int getTypeWL() {return 36;}		public boolean isDynamique(){return false;}	public Class getClasseWD(){return GWDCAnnonces.class;}		});
super.ajouterVariableGlobale("tabAnnonces",vWD_tabAnnonces);



// HModifieStructure("*")
WDAPIHF.hModifieStructure(new WDChaineU("*"));

}





////////////////////////////////////////////////////////////////////////////
// Déclaration des variables globales
////////////////////////////////////////////////////////////////////////////
static public WDObjet vWD_TypeFile = WDVarNonAllouee.ref;
static public WDObjet vWD_gnModeCopierCouper = WDVarNonAllouee.ref;
static public WDObjet vWD_gsFichierCopierCouper = WDVarNonAllouee.ref;
static public WDObjet vWD_gsFichierListe = WDVarNonAllouee.ref;
static public WDObjet vWD_gsUrlapi = WDVarNonAllouee.ref;
static public WDObjet vWD_sReponses = WDVarNonAllouee.ref;
static public WDObjet vWD_sErrorResponses = WDVarNonAllouee.ref;
static public WDObjet vWD_sCodeStatus = WDVarNonAllouee.ref;
static public WDObjet vWD_gnTypedenonciation = WDVarNonAllouee.ref;
static public WDObjet vWD_gnTypePreuve1 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnTypePreuve2 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnTypePreuve3 = WDVarNonAllouee.ref;
static public WDObjet vWD_gnCheckEntite = WDVarNonAllouee.ref;
static public WDObjet vWD_pos = WDVarNonAllouee.ref;
static public WDObjet vWD_MaPosition = WDVarNonAllouee.ref;
static public WDObjet vWD_resultatprovince = WDVarNonAllouee.ref;
static public WDObjet vWD_resultatterritoire = WDVarNonAllouee.ref;
static public WDObjet vWD_resultatEntiteAccuse = WDVarNonAllouee.ref;
static public WDObjet vWD_resultatDirectionAccuse = WDVarNonAllouee.ref;
static public WDObjet vWD_UnePlainte = WDVarNonAllouee.ref;
static public WDObjet vWD_unFilesPlainte = WDVarNonAllouee.ref;
static public WDObjet vWD_tabFilesPlainte = WDVarNonAllouee.ref;
static public WDObjet vWD_resultatTypePlainte = WDVarNonAllouee.ref;
static public WDObjet vWD_tabPlainte = WDVarNonAllouee.ref;
static public WDObjet vWD_unePlainteValide = WDVarNonAllouee.ref;
static public WDObjet vWD_tabSuiviPlainte = WDVarNonAllouee.ref;
static public WDObjet vWD_unePlainteFound = WDVarNonAllouee.ref;
static public WDObjet vWD_tabAnnonces = WDVarNonAllouee.ref;
public String getVersionApplication(){ return "0.0.13.0";}
public String getNomSociete(){ return "TONO Consulting";}
public String getNomAPK(){ return "FinAlerte";}
public int getIdNomApplication(){return com.masociete.finalerte.R.string.app_name;}
public boolean isModeAnsi(){ return false;}
public boolean isAffectationTableauParCopie(){ return true;}
public boolean isAssistanceAutoHFActive(){ return true;}
public String getPackageRacine(){ return "com.masociete.finalerte";}
public int getIdIconeApplication(){ return com.masociete.finalerte.R.drawable.logofin_2;}
public int getInfoPlateforme(EWDInfoPlateforme info)
{
switch(info)
{
case DPI_ECRAN : return 160;
case HAUTEUR_BARRE_SYSTEME : return 25;
case HAUTEUR_BARRE_TITRE : return 25;
case HAUTEUR_ACTION_BAR : return 48;
case HAUTEUR_BARRE_BAS : return 0;
case HAUTEUR_ECRAN : return 568;
case LARGEUR_ECRAN : return 320;
default : return 0;
}
}
public boolean isActiveThemeMaterialDesign()
{
return true;
}
////////////////////////////////////////////////////////////////////////////
public String getAdresseEmail() 
{
return "hervelepeya01@gmail.com";
}
public boolean isIgnoreErreurCertificatHTTPS()
{
return false;
}
////////////////////////////////////////////////////////////////////////////
public boolean isUniteAffichageLogique()
{
return false;
}
public String getNomProjet()
{
return "Tono CF";
}
public String getNomConfiguration()
{
return "Application Android";
}
public String getNomAnalyse()
{
return "tono_cf";
}
public String getMotDePasseAnalyse()
{
return "";
}
public boolean isModeGestionFichierMultiUtilisateur()
{
return true;
}
public boolean isCreationAutoFichierDonnees()
{
return true;
}

////////////////////////////////////////////////////////////////////////////
// Formats des masques du projet
////////////////////////////////////////////////////////////////////////////
public String getFichierWDM()
{
return null;
}
protected void declarerRessources()
{
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_PICT_SAVE_16_5.PNG",com.masociete.finalerte.R.drawable.material_design_blue_pict_save_16_5_43, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\WPS12445.PNG?E5",com.masociete.finalerte.R.drawable.wps12445_42_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\WPS12120.PNG?E5",com.masociete.finalerte.R.drawable.wps12120_41_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\WPS10214.PNG?E5",com.masociete.finalerte.R.drawable.wps10214_40_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\IOA01611A.PNG?E5",com.masociete.finalerte.R.drawable.ioa01611a_39_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\FLS12428M.PNG",com.masociete.finalerte.R.drawable.fls12428m_38, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\WPS01330C.PNG?E5",com.masociete.finalerte.R.drawable.wps01330c_37_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\IOB13150.PNG",com.masociete.finalerte.R.drawable.iob13150_36, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_RADIO.PNG?E12_8O",com.masociete.finalerte.R.drawable.material_design_blue_radio_35_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_COMBO.PNG?E5_3NP_32_6_42_6",com.masociete.finalerte.R.drawable.material_design_blue_combo_34_np3_32_6_42_6_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\IMG-NOUVEAU-EMAIL.SVG",com.masociete.finalerte.R.raw.img_nouveau_email_33, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_EDT.PNG?E5_3NP_8_8_8_8",com.masociete.finalerte.R.drawable.material_design_blue_edt_32_np3_8_8_8_8_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_BTN_STD.PNG?E5_3NP_10_10_10_10",com.masociete.finalerte.R.drawable.material_design_blue_btn_std_31_np3_10_10_10_10_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\WPS10211.PNG?E5",com.masociete.finalerte.R.drawable.wps10211_30_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\WPS01500.PNG?E5",com.masociete.finalerte.R.drawable.wps01500_29_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\WPS01074.PNG?E5",com.masociete.finalerte.R.drawable.wps01074_28_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\PDF.PNG",com.masociete.finalerte.R.drawable.pdf_27, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\MUSICS.PNG",com.masociete.finalerte.R.drawable.musics_26, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\INFO_B_32_5.PNG?E5",com.masociete.finalerte.R.drawable.info_b_32_5_25_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\DOCUMENTS.PNG",com.masociete.finalerte.R.drawable.documents_24, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ZTIM_ROLLOVER.PNG",com.masociete.finalerte.R.drawable.ztim_rollover_23, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ZTIM_BREAK_PICT.PNG?E2_4O",com.masociete.finalerte.R.drawable.ztim_break_pict_22_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ZTIM_BREAK.PNG",com.masociete.finalerte.R.drawable.ztim_break_21, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ZTIM_BG_SHEET_SELECT.PNG?_3NP_5_5_5_5",com.masociete.finalerte.R.drawable.ztim_bg_sheet_select_20_np3_5_5_5_5, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\DOSSIER.PNG",com.masociete.finalerte.R.drawable.dossier_19, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\FLS18149.PNG",com.masociete.finalerte.R.drawable.fls18149_18, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_ROLLOVER.PNG",com.masociete.finalerte.R.drawable.material_design_blue_rollover_17, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_CBOX.PNG?E12_8O",com.masociete.finalerte.R.drawable.material_design_blue_cbox_16_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_BREAK_PICT.PNG?E2_4O",com.masociete.finalerte.R.drawable.material_design_blue_break_pict_15_selector, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\GABARITS\\WM\\210 MATERIAL DESIGN BLUE\\MATERIAL DESIGN BLUE_BREAK.PNG",com.masociete.finalerte.R.drawable.material_design_blue_break_14, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\FLS01322.PNG",com.masociete.finalerte.R.drawable.fls01322_13, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ANL13210.PNG",com.masociete.finalerte.R.drawable.anl13210_12, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ANL10060.PNG",com.masociete.finalerte.R.drawable.anl10060_11, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\PICT-MAIL.PNG",com.masociete.finalerte.R.drawable.pict_mail_10, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ICONETONO TRANS NEW2.PNG",com.masociete.finalerte.R.drawable.iconetono_trans_new2_9, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ENTETE-BCKGRD.PNG",com.masociete.finalerte.R.drawable.entete_bckgrd_8, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ABOUT_VERSION.PNG",com.masociete.finalerte.R.drawable.about_version_7, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ABOUT_NOTER.PNG",com.masociete.finalerte.R.drawable.about_noter_6, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ABOUT_APP.PNG",com.masociete.finalerte.R.drawable.about_app_5, "");
super.ajouterFichierAssocie("E:\\MES PROJETS\\PROJET ROGER\\TONO CF\\ABOUT.PNG",com.masociete.finalerte.R.drawable.about_4, "");
super.ajouterFichierAssocie("E:\\Mes projets\\Projet ROGER\\Tono CF\\logo_black.png",com.masociete.finalerte.R.drawable.logo_black_3, "");
}
// Initialisation des collections de procédures
public void initCollections()
{
GWDCPCOL_Extension.init();

}


// Terminaison des collections de procédures
public void terminaisonCollections()
{
GWDCPCOL_Extension.term();

}

/**
 * Lancer de l'application Android
 */
public static class WDLanceur extends WDAbstractLanceur
{
public Class<? extends WDProjet> getClasseProjet()
{
return GWDPTono_CF.class;
}
}
}
