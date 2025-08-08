using EjercicioTallerServicios.Models;
using EjercicioTallerServicios.Interfaces;
using EjercicioTallerServicios.Services;

var builder = WebApplication.CreateBuilder(args);

// Registrar como Singleton
builder.Services.AddSingleton<IRepositorioTalleres, RepositorioTalleres>();
builder.Services.AddSingleton<IRepositorioMecanicos, RepositorioMecanicos>();
builder.Services.AddSingleton<IRepositorioCoches, RepositorioCoches>();

// Add services to the container.
builder.Services.AddControllersWithViews();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Talleres}/{action=Taller}/{id?}");

app.Run();
