package it.me.tae.mygithub.github;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by realize on 25/3/2559.
 */
public class Github {
    @JsonProperty("login")
    private String login;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("avatar_url")
    private String avatarUrl;
    @JsonProperty("gravatar_id")
    private String gravatarId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("followers_url")
    private String followersUrl;
    @JsonProperty("following_url")
    private String followingUrl;
    @JsonProperty("gists_url")
    private String gistsUrl;
    @JsonProperty("starred_url")
    private String starredUrl;
    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;
    @JsonProperty("organizations_url")
    private String organizationsUrl;
    @JsonProperty("repos_url")
    private String reposUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("received_events_url")
    private String receivedEventsUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("site_admin")
    private Boolean siteAdmin;
    @JsonProperty("name")
    private String name;
    @JsonProperty("company")
    private Object company;
    @JsonProperty("blog")
    private String blog;
    @JsonProperty("location")
    private String location;
    @JsonProperty("email")
    private String email;
    @JsonProperty("hireable")
    private Boolean hireable;
    @JsonProperty("bio")
    private Object bio;
    @JsonProperty("public_repos")
    private Integer publicRepos;
    @JsonProperty("public_gists")
    private Integer publicGists;
    @JsonProperty("followers")
    private Integer followers;
    @JsonProperty("following")
    private Integer following;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;

    /**
     *
     * @return
     * The login
     */
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     * The login
     */
    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The avatarUrl
     */
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     *
     * @param avatarUrl
     * The avatar_url
     */
    @JsonProperty("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     *
     * @return
     * The gravatarId
     */
    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     *
     * @param gravatarId
     * The gravatar_id
     */
    @JsonProperty("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    /**
     *
     * @return
     * The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The htmlUrl
     */
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     *
     * @param htmlUrl
     * The html_url
     */
    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     *
     * @return
     * The followersUrl
     */
    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     *
     * @param followersUrl
     * The followers_url
     */
    @JsonProperty("followers_url")
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     *
     * @return
     * The followingUrl
     */
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     *
     * @param followingUrl
     * The following_url
     */
    @JsonProperty("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     *
     * @return
     * The gistsUrl
     */
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     *
     * @param gistsUrl
     * The gists_url
     */
    @JsonProperty("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     *
     * @return
     * The starredUrl
     */
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     *
     * @param starredUrl
     * The starred_url
     */
    @JsonProperty("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     *
     * @return
     * The subscriptionsUrl
     */
    @JsonProperty("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     *
     * @param subscriptionsUrl
     * The subscriptions_url
     */
    @JsonProperty("subscriptions_url")
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    /**
     *
     * @return
     * The organizationsUrl
     */
    @JsonProperty("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     *
     * @param organizationsUrl
     * The organizations_url
     */
    @JsonProperty("organizations_url")
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     *
     * @return
     * The reposUrl
     */
    @JsonProperty("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     *
     * @param reposUrl
     * The repos_url
     */
    @JsonProperty("repos_url")
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     *
     * @return
     * The receivedEventsUrl
     */
    @JsonProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     *
     * @param receivedEventsUrl
     * The received_events_url
     */
    @JsonProperty("received_events_url")
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The siteAdmin
     */
    @JsonProperty("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    /**
     *
     * @param siteAdmin
     * The site_admin
     */
    @JsonProperty("site_admin")
    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The company
     */
    @JsonProperty("company")
    public Object getCompany() {
        return company;
    }

    /**
     *
     * @param company
     * The company
     */
    @JsonProperty("company")
    public void setCompany(Object company) {
        this.company = company;
    }

    /**
     *
     * @return
     * The blog
     */
    @JsonProperty("blog")
    public String getBlog() {
        return blog;
    }

    /**
     *
     * @param blog
     * The blog
     */
    @JsonProperty("blog")
    public void setBlog(String blog) {
        this.blog = blog;
    }

    /**
     *
     * @return
     * The location
     */
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @return
     * The hireable
     */
    @JsonProperty("hireable")
    public Boolean getHireable() {
        return hireable;
    }

    /**
     *
     * @param hireable
     * The hireable
     */
    @JsonProperty("hireable")
    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    /**
     *
     * @return
     * The bio
     */
    @JsonProperty("bio")
    public Object getBio() {
        return bio;
    }

    /**
     *
     * @param bio
     * The bio
     */
    @JsonProperty("bio")
    public void setBio(Object bio) {
        this.bio = bio;
    }

    /**
     *
     * @return
     * The publicRepos
     */
    @JsonProperty("public_repos")
    public Integer getPublicRepos() {
        return publicRepos;
    }

    /**
     *
     * @param publicRepos
     * The public_repos
     */
    @JsonProperty("public_repos")
    public void setPublicRepos(Integer publicRepos) {
        this.publicRepos = publicRepos;
    }

    /**
     *
     * @return
     * The publicGists
     */
    @JsonProperty("public_gists")
    public Integer getPublicGists() {
        return publicGists;
    }

    /**
     *
     * @param publicGists
     * The public_gists
     */
    @JsonProperty("public_gists")
    public void setPublicGists(Integer publicGists) {
        this.publicGists = publicGists;
    }

    /**
     *
     * @return
     * The followers
     */
    @JsonProperty("followers")
    public Integer getFollowers() {
        return followers;
    }

    /**
     *
     * @param followers
     * The followers
     */
    @JsonProperty("followers")
    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    /**
     *
     * @return
     * The following
     */
    @JsonProperty("following")
    public Integer getFollowing() {
        return following;
    }

    /**
     *
     * @param following
     * The following
     */
    @JsonProperty("following")
    public void setFollowing(Integer following) {
        this.following = following;
    }

    /**
     *
     * @return
     * The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}