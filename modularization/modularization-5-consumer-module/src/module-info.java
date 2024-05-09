module consumer {
    requires service.provider;
    requires transitive java.logging;
}