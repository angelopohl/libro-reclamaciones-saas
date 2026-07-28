# Libro de Reclamaciones Inteligente (SaaS)

Sistema de gestión automatizada de cumplimiento normativo (Indecopi) diseñado para Mypes peruanas, construido con arquitectura multi-tenant.

---

## arc42 Documentación de Arquitectura

### 1. Introducción y Objetivos
Las Mypes peruanas enfrentan multas severas por incumplir el plazo de 15 días hábiles al responder reclamos de consumidores. Este sistema centraliza la recepción, automatiza la emisión de constancias legales en PDF y genera alertas proactivas para evitar infracciones.

**Stakeholders Principales:**
- **Dueño de la Mype:** Busca cumplimiento legal automático, cero fricción de instalación y alertas de plazos.
- **Consumidor Final:** Requiere un canal formal, ágil y con trazabilidad de su queja (código correlativo).

### 2. Restricciones de la Arquitectura
*(Por definir: limitantes de tecnología, normativas de Indecopi y Ley de Protección de Datos Personales).*

### 3. Contexto y Alcance
*(Por definir: diagramas de contexto del sistema interactuando con usuarios externos y servicios de correo).*

### 4. Estrategia de Solución
*(Por definir: cómo usaremos Java, Spring Boot, PostgreSQL multi-tenant y AWS/Terraform para resolver el problema).*

### 5. Vista de Bloques (Componentes)
*(Por definir: la separación entre la API, la Base de Datos y los Workers asíncronos).*

### 6. Vista de Ejecución (Runtime)
*(Por definir: cómo fluye la información desde que el cliente envía el reclamo hasta que se guarda y notifica).*

### 7. Vista de Despliegue
*(Por definir: la infraestructura en AWS utilizando contenedores Docker).*

### 8. Conceptos Transversales
*(Por definir: manejo de excepciones, seguridad de base de datos multi-tenant y auditoría de tickets).*

### 9. Decisiones de Arquitectura (ADRs)
*(Aquí documentaremos decisiones clave como por qué elegimos aislamiento lógico de BD en lugar de físico).*

---