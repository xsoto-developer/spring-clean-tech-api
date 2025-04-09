# SpringCleanTechAPI - API de Catálogo de Gadgets Futuristas

## Descripción del proyecto
**SpringCleanTechAPI** es una API REST desarrollada en Java con Spring Boot que gestiona un catálogo de productos tecnológicos innovadores, como gadgets futuristas. Este proyecto está diseñado como un ejemplo de excelencia técnica, aplicando principios de calidad de código (*YAGNI, KISS, DRY, SOLID*) y Clean Architecture. Es ideal para equipos de desarrollo que buscan una referencia práctica y para arquitectos o líderes tecnológicos que valoran soluciones modernas, bien estructuradas y escalables.

## Características relevantes
- **Calidad de código**: Implementación estricta de principios SOLID y prácticas como *DRY* y *KISS*, con código auto-documentado.
- **Arquitectura limpia**: Separación clara de capas (dominio, aplicación, infraestructura) para facilitar mantenimiento y escalabilidad.
- **Pruebas robustas**: Cobertura >80% con pruebas unitarias, de integración y funcionales, usando JUnit y Mockito.
- **Innovación atractiva**: Incluye un endpoint `/products/trending` que simula gadgets futuristas, como "Drone Quantum X".
- **Documentación profesional**: Integración con Swagger para una experiencia visual e interactiva.

### Relevancia en un entorno tecnológico
- **Escalabilidad**: Diseñada para crecer con facilidad, ideal para microservicios o proyectos enterprise.
- **Adopción rápida**: Configuración sencilla con Maven y H2, sin dependencias externas complejas.
- **Atractivo técnico**: Combina simplicidad con sofisticación, destacando para presentaciones a líderes y arquitectos.

## Requisitos
- Java 17+
- Maven 3.8+
- IDE (recomendado: IntelliJ o VS Code)

## Instalación y ejecución
1. Clona el repositorio:
   ```bash
   git clone https://github.com/xsoto-developer/spring-clean-tech-api.git

2. Ejecuta la aplicación con:
   ```bash
      mvn spring-boot:run
   
3. Accede a la consola H2 en http://localhost:8080/h2-console:
   JDBC URL: jdbc:h2:mem:cleantechdb
   Username: sa
   Password: (dejar en blanco)

4. Explora la API en http://localhost:8080/swagger-ui.html