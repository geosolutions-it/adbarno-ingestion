/*
 *  Copyright (C) 2007-2012 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.geobatch.migrationmonitor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * 
 * This Class models the strati_rif DataBase table
 * 
 * 
 * @author DamianoG
 *
 */
@Entity(name="strati_rif")
public class MigrationMonitor {
    
    @Id
    @Column(name="id_strato")
    private Long layerId;
    
    @Column(name="id_repertorio")
    private Integer inventoryId;
    
    @Column(name="server_name")
    private String serverName;
    
    @Column(name="server_ip")
    private String serverIp;
    
    @Column(name="server_port")
    private Integer serverPort;
    
    @Column(name="db")
    private String database;
    
    @Column(name="schema_nome")
    private String schemaName;
    
    @Column(name="tabella")
    private String tableName;
    
    @Column(name="id_attivazione")
    private Integer activationId;
    
    @Column(name="epsg")
    private String epsg;
    
    @Lob
    @Column(name="note")
    private String note;
    
    @Column(name="stato_migrazione")
    private String migrationStatus;
    
    @Column(name="attivo")
    private Boolean active;

    
    public MigrationMonitor() {}

    /**
     * @return the layerId
     */
    public Long getLayerId() {
        return layerId;
    }

    /**
     * @param layerId the layerId to set
     */
    public void setLayerId(Long layerId) {
        this.layerId = layerId;
    }

    /**
     * @return the inventoryId
     */
    public Integer getInventoryId() {
        return inventoryId;
    }

    /**
     * @param inventoryId the inventoryId to set
     */
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * @return the serverName
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * @param serverName the serverName to set
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * @return the serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * @param serverIp the serverIp to set
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * @return the serverPort
     */
    public Integer getServerPort() {
        return serverPort;
    }

    /**
     * @param serverPort the serverPort to set
     */
    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * @return the database
     */
    public String getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * @return the schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * @param schemaName the schemaName to set
     */
    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * @return the tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName the tableName to set
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return the activationId
     */
    public Integer getActivationId() {
        return activationId;
    }

    /**
     * @param activationId the activationId to set
     */
    public void setActivationId(Integer activationId) {
        this.activationId = activationId;
    }

    /**
     * @return the epsg
     */
    public String getEpsg() {
        return epsg;
    }

    /**
     * @param epsg the epsg to set
     */
    public void setEpsg(String epsg) {
        this.epsg = epsg;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * @return the migrationStatus
     */
    public String getMigrationStatus() {
        return migrationStatus;
    }

    /**
     * @param migrationStatus the migrationStatus to set
     */
    public void setMigrationStatus(String migrationStatus) {
        this.migrationStatus = migrationStatus;
    }

    /**
     * @return the active value
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active the active value to set
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    
}
