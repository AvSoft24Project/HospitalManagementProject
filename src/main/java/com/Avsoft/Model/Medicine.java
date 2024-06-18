package com.Avsoft.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "batch_id", nullable = false)
	private String batchId;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "manufacturers", nullable = false)
	private String manufacturers;

	@Column(name = "salt_composition", columnDefinition = "TEXT")
	private String saltComposition;

	@Column(name = "introduction", columnDefinition = "TEXT")
	private String introduction;

	@Column(name = "benefits", columnDefinition = "TEXT")
	private String benefits;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;

	@Column(name = "how_to_use", columnDefinition = "TEXT")
	private String howToUse;

	@Column(name = "safety_advise", columnDefinition = "TEXT")
	private String safetyAdvise;

	@Column(name = "if_miss", columnDefinition = "TEXT")
	private String ifMiss;

	@Column(name = "packaging", columnDefinition = "TEXT")
	private String packaging;

	@Column(name = "packages", columnDefinition = "TEXT")
	private String packages;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "product_form", columnDefinition = "TEXT")
	private String productForm;

	@Column(name = "mrp")
	private Double mrp;

	@Column(name = "prescription_required")
	private Boolean prescriptionRequired;

	@Column(name = "label", columnDefinition = "TEXT")
	private String label;

	@Column(name = "fact_box", columnDefinition = "TEXT")
	private String factBox;

	@Column(name = "primary_use", columnDefinition = "TEXT")
	private String primaryUse;

	@Column(name = "storage", columnDefinition = "TEXT")
	private String storage;

	@Column(name = "use_of", columnDefinition = "TEXT")
	private String useOf;

	@Column(name = "common_side_effect", columnDefinition = "TEXT")
	private String commonSideEffect;

	@Column(name = "alcohol_interaction", columnDefinition = "TEXT")
	private String alcoholInteraction;

	@Column(name = "pregnancy_interaction", columnDefinition = "TEXT")
	private String pregnancyInteraction;

	@Column(name = "lactation_interaction", columnDefinition = "TEXT")
	private String lactationInteraction;

	@Column(name = "driving_interaction", columnDefinition = "TEXT")
	private String drivingInteraction;

	@Column(name = "kidney_interaction", columnDefinition = "TEXT")
	private String kidneyInteraction;

	@Column(name = "liver_interaction", columnDefinition = "TEXT")
	private String liverInteraction;

	@Column(name = "manufacturer_address", columnDefinition = "TEXT")
	private String manufacturerAddress;

	@Column(name = "country_of_origin", columnDefinition = "TEXT")
	private String countryOfOrigin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturers() {
		return manufacturers;
	}

	public void setManufacturers(String manufacturers) {
		this.manufacturers = manufacturers;
	}

	public String getSaltComposition() {
		return saltComposition;
	}

	public void setSaltComposition(String saltComposition) {
		this.saltComposition = saltComposition;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getBenefits() {
		return benefits;
	}

	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHowToUse() {
		return howToUse;
	}

	public void setHowToUse(String howToUse) {
		this.howToUse = howToUse;
	}

	public String getSafetyAdvise() {
		return safetyAdvise;
	}

	public void setSafetyAdvise(String safetyAdvise) {
		this.safetyAdvise = safetyAdvise;
	}

	public String getIfMiss() {
		return ifMiss;
	}

	public void setIfMiss(String ifMiss) {
		this.ifMiss = ifMiss;
	}

	public String getPackaging() {
		return packaging;
	}

	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}

	public String getPackages() {
		return packages;
	}

	public void setPackages(String packages) {
		this.packages = packages;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getProductForm() {
		return productForm;
	}

	public void setProductForm(String productForm) {
		this.productForm = productForm;
	}

	public Double getMrp() {
		return mrp;
	}

	public void setMrp(Double mrp) {
		this.mrp = mrp;
	}

	public Boolean getPrescriptionRequired() {
		return prescriptionRequired;
	}

	public void setPrescriptionRequired(Boolean prescriptionRequired) {
		this.prescriptionRequired = prescriptionRequired;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getFactBox() {
		return factBox;
	}

	public void setFactBox(String factBox) {
		this.factBox = factBox;
	}

	public String getPrimaryUse() {
		return primaryUse;
	}

	public void setPrimaryUse(String primaryUse) {
		this.primaryUse = primaryUse;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getUseOf() {
		return useOf;
	}

	public void setUseOf(String useOf) {
		this.useOf = useOf;
	}

	public String getCommonSideEffect() {
		return commonSideEffect;
	}

	public void setCommonSideEffect(String commonSideEffect) {
		this.commonSideEffect = commonSideEffect;
	}

	public String getAlcoholInteraction() {
		return alcoholInteraction;
	}

	public void setAlcoholInteraction(String alcoholInteraction) {
		this.alcoholInteraction = alcoholInteraction;
	}

	public String getPregnancyInteraction() {
		return pregnancyInteraction;
	}

	public void setPregnancyInteraction(String pregnancyInteraction) {
		this.pregnancyInteraction = pregnancyInteraction;
	}

	public String getLactationInteraction() {
		return lactationInteraction;
	}

	public void setLactationInteraction(String lactationInteraction) {
		this.lactationInteraction = lactationInteraction;
	}

	public String getDrivingInteraction() {
		return drivingInteraction;
	}

	public void setDrivingInteraction(String drivingInteraction) {
		this.drivingInteraction = drivingInteraction;
	}

	public String getKidneyInteraction() {
		return kidneyInteraction;
	}

	public void setKidneyInteraction(String kidneyInteraction) {
		this.kidneyInteraction = kidneyInteraction;
	}

	public String getLiverInteraction() {
		return liverInteraction;
	}

	public void setLiverInteraction(String liverInteraction) {
		this.liverInteraction = liverInteraction;
	}

	public String getManufacturerAddress() {
		return manufacturerAddress;
	}

	public void setManufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress = manufacturerAddress;
	}

	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}

	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

}