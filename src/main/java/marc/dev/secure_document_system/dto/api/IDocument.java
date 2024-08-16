package marc.dev.secure_document_system.dto.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public interface IDocument {
    Long getId();
    void setId(Long id);
    @JsonProperty("documentId")
    String getDocument_Id();
    void setDocument_Id(String documentId);

    String getName();
    void setName(String name);
    String getDescription();
    void setDescription(String description);
    String getUri();
    void setUri(String uri);
    String getIcon();
    void setIcon(String icon);
    Long getSize();
    void setSize(Long size);
     @JsonProperty("formattedSize")
    String getFormatted_Size();
    void setFormatted_Size(String formattedSize);
    String getExtension();
    void setExtension(String extension);
    @JsonProperty("referenceId")
    String getReference_Id();
    void setReference_Id(String referenceId);
    @JsonProperty("createdAt")
    LocalDateTime getCreated_At();
    void setCreated_At(LocalDateTime createdAt);
    @JsonProperty("updatedAt")
    LocalDateTime getUpdated_At();
    void setUpdated_At(LocalDateTime updatedAt);
    @JsonProperty("ownerName")
    String getOwner_Name();
    void setOwner_Name(String ownerName);
    @JsonProperty("ownerEmail")
    String getOwner_Email();
    void setOwner_Email(String ownerEmail);
    @JsonProperty("ownerPhone")
    String getOwner_Phone();
    void setOwner_Phone(String ownerPhone);
    @JsonProperty("ownerLastLogin")
    LocalDateTime getOwner_Last_Login();
    void setOwner_Last_Login(String ownerLastLogin);
    @JsonProperty("updaterName")
    String getUpdater_Name();
    void setUpdater_Name(String updaterName);
}