import "./App.css";

function App() {
  const heading = "Office Space";

  const officeImage =
    "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=700";

  const offices = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore",
    },
    {
      Name: "Regus",
      Rent: 45000,
      Address: "Hyderabad",
    },
    {
      Name: "SmartWorks",
      Rent: 90000,
      Address: "Pune",
    },
  ];

  return (
    <div className="App">
      <h1>{heading}, at Affordable Range</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="350"
        height="250"
      />

      <br />
      <br />

      {offices.map((office, index) => (
        <div key={index}>
          <h2>Name: {office.Name}</h2>

          <h3
            style={{
              color: office.Rent <= 60000 ? "red" : "green",
            }}
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>Address: {office.Address}</h3>

          <hr />
        </div>
      ))}
    </div>
  );
}

export default App;